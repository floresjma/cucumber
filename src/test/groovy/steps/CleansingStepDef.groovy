package steps

import sun.security.util.PendingException

/**
 * Created by juan on 02/04/2017.
 */

this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)


    Given ( ~/ ^I do not have a file as an input to process the job$ / ) {
        ->
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException()
    }

    When ( ~/ ^I run the Cleansing Job$ / ) {
        ->
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException()
    }

    Then ( ~/ ^I receive an email with an error message$ / ) {
        ->
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException()
    }

    Given ( ~/ ^I have an empty file as an input to process the job$ / ) {
        ->
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException()
    }