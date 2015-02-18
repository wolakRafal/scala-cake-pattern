package di.patterns.cake_pattern.anotherexample

case class User(name: String, password: String)

trait UserServiceComponent { this: UserRepositoryComponent =>

  val userService: UserService

  class UserService {
    def authenticate(username: String, password: String): User =
      userRepository.authenticate(new User(username, password))
    def create(username: String, password: String) =
      userRepository.create(new User(username, password))
    def delete(user: User) = userRepository.delete(user)
  }
}

