package eu.delving.definitions

/**
 * The minimal set of information necessary to lookup an organization
 *
 * @author Manuel Bernhardt <bernhardt.manuel@gmail.com>
 */

case class Organization(uri: String,
                        name: String,
                        countryCode: String
                       )