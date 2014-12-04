package org.lappsgrid.licensing.services

import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
//import org.lappsgrid.licensing.Permissions
import org.lappsgrid.licensing.core.Respond

import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

//import static org.lappsgrid.licensing.Permission.*

/**
 * @author Keith Suderman
 */
@Path("/tokenize")
class Tokenizer {

//    Permissions requiredPermissions

    public Tokenizer() {
//        requiredPermissions = new Permissions([RESEARCH_USE, COMMERCIAL_USE, REDISTRIBUTION, ATTRIBUTION])
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response tokenize(String entity) {
//        def input = new JsonSlurper().parseText(entity)
//        def output = new JsonBuilder()
//        if (input.code != 0) {
//            output {
//                code input.code
//                message "Invalid input to the tokenizer"
//            }
//            return Respond.json(output.toString())
//        }
//        if (!input.permissions) {
//            output {
//                code 1
//                message "No permissions object provided."
//            }
//            return Respond.json(output.toString())
//        }
//        Permissions requested = new Permissions(input.permissions)
//        if (requiredPermissions.allows(requested)) {
//            String[] result = input.text.split("\\s+")
//            output {
//                code 0
//                permissions requested.permissions
//                tokens Arrays.asList(result)
//            }
//        }
//        else {
//            output {
//                code 2
//                message "Insufficient permissions. This operation is not permitted."
//            }
//        }
//        return Respond.json(output.toString())
        Respond.error("Unsupported opertation.")
    }

}
