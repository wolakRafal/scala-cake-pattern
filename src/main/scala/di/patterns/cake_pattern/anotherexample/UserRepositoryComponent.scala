package di.patterns.cake_pattern.anotherexample

// using self-type annotation declaring the dependencies this
// component requires, in our case the UserRepositoryComponent
trait UserRepositoryComponent {

  val userRepository: UserRepository

    class UserRepository {
      def authenticate(user: User): User = {
        println("authenticating user: " + user)
        user
      }

      def create(user: User) = println("creating user: " + user)
      def delete(user: User) = println("deleting user: " + user)
    }
}

