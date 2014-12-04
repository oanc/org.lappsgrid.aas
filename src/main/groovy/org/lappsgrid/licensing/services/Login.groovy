package org.lappsgrid.licensing.services

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import org.lappsgrid.licensing.domain.User
import org.lappsgrid.licensing.core.Respond
import org.lappsgrid.licensing.core.UserDB

import javax.ws.rs.Consumes
import javax.ws.rs.DefaultValue
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

/**
 * @author Keith Suderman
 */
@Path("/login")
class Login {
    UserDB userDB = new UserDB()

//    @GET
//    @Path('/login')
//    @Produces(MediaType.APPLICATION_JSON)
//    Response login() {
//        JsonBuilder json = new JsonBuilder()
//        json {
//            code 0
//            message "OK"
//        }
//        return Respond.json(json.toString())
//    }

    @GET
//    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    Response login(@QueryParam('username')
                   String username,
                   @QueryParam('password')
                   String password) {
        JsonBuilder json = new JsonBuilder()
        if (username == null) {
            json {
                code 1
                message "No username provided"
            }
            return Respond.json(json.toString())
        }
        if (password == null) {
            json {
                code 2
                message "No password provided"
            }
            return Respond.json(json.toString())
        }
        User user = userDB.get(username)
        if (user == null) {
            json {
                code 3
                message "No such user."
            }
            return Respond.json(json.toString())
        }
        if (user.password != password) {
            json {
                code 4
                message "Invalid password"
            }
            return Respond.json(json.toString())
        }
        json {
            code 0
            permissions user.permissions.permissions
        }
        return Respond.json(json.toString())
    }

}
