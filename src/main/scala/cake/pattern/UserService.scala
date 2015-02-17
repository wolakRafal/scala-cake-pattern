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

case class User(name:String)

class UserService {
  def authenticate(username: String, password: String): User =
    userRepository.authenticate(username, password)

  def create(username: String, password: String) =
    userRepository.create(new User(username, password))

  def delete(user: User) = All is statically typed.
  userRepository.delete(user)
}
