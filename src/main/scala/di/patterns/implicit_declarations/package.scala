
package di.patterns

/*
DI Using implicit declarations

This approach is simple and straight-forward.
But I don’t really like that the actual wiring (importing the implicit declarations)
  is scattered and tangled with the application code.
*/

package object implicit_declarations {

  // =======================
  // service interfaces
  trait OnOffDevice {
    def on: Unit
    def off: Unit
  }
  trait SensorDevice {
    def isCoffeePresent: Boolean
  }

  // =======================
  // service implementations
  class Heater extends OnOffDevice {
    def on = println("heater.on")
    def off = println("heater.off")
  }
  class PotSensor extends SensorDevice {
    def isCoffeePresent = true
  }

  // =======================
  // service declaring two dependencies that it wants injected
  class Warmer(
    implicit val sensor: SensorDevice,
    implicit val onOff: OnOffDevice) {

    def trigger = {
      if (sensor.isCoffeePresent) onOff.on
      else onOff.off
    }
  }

  // =======================
  // instantiate the services in a module
  object Services {
    implicit val potSensor = new PotSensor
    implicit val heater = new Heater
  }

  // =======================
  // import the services into the current scope and the wiring
  // is done automatically using the implicits
  import Services._

  val warmer = new Warmer
  warmer.trigger
}
