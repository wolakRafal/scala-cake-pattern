package cake.pattern

import org.specs2.mock.Mockito

trait TestEnvironment extends UserServiceComponent
                        with  UserRepositoryComponent
                        with Mockito {
  val userRepository = mock[UserRepository]
  val userService = mock[UserService]
}

