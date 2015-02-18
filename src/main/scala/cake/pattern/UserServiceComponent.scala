package cake.pattern

case class User(name: String, password: String)

trait UserServiceComponent { this: UserRepositoryComponent =>

  val userService = ComponentRegistry.userService

  class UserService {
    def authenticate(username: String, password: String): User =
      userRepository.authenticate(new User(username, password))
    def create(username: String, password: String) =
      userRepository.create(new User(username, password))
    def delete(user: User) = userRepository.delete(user)
  }
}

