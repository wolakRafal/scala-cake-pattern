/** ***************************************************************************
  * Copyright (c) 2015
  * ADVA Optical Networking
  *
  * All rights reserved. Any unauthorized disclosure or publication of the
  * confidential and proprietary information to any other party will constitute
  * an infringement of copyright laws.
  *
  * $Id$
  * Author  : Rafal Wolak, RWolak@advaoptical.com
  * Created : 17 February 2015
  * Purpose :
  *
  * $Rev$
  * $URL$
  *
  * Notes:
  *
  * ****************************************************************************
  */

package cake.pattern

trait UserRepositoryComponent {
  val userRepository = new UserRepository

  class UserRepository {

    class UserRepository {
      def authenticate(user: User): User = {
        println("authenticating user: " + user)
        user
      }

      def create(user: User) = println("creating user: " + user)
      def delete(user: User) = println("deleting user: " + user)
    }
  }
}

