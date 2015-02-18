package di.patterns.cake_pattern

import di.patterns.cake_pattern.anotherexample.{UserServiceComponent, UserRepositoryComponent}
import org.specs2.mock.Mockito

trait TestEnvironment extends UserServiceComponent
                        with  UserRepositoryComponent
                        with Mockito {
  val userRepository = mock[UserRepository]
  val userService = mock[UserService]
}

