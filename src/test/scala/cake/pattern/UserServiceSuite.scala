package cake.pattern

import org.specs2.mutable._

class UserServiceSuite extends Specification with TestEnvironment {

  " The authenticate user test" should {
    "create a fresh and clean (non-mock) UserService " in {

      // create a fresh and clean (non-mock) UserService
      // (who's userRepository is still a mock)
      val userService = new UserService
      // record the mock invocation
      val user: User = new User("test", "test")
      userRepository.authenticate(user) must beEqualTo(user)
    }
  }
}

