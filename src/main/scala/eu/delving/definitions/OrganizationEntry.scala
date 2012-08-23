package eu.delving.definitions

/**
 * The minimal set of information necessary to lookup an organization in the Directory service
 *
 * @author Manuel Bernhardt <bernhardt.manuel@gmail.com>
 */

case class OrganizationEntry(uri: String,
                             name: String,
                             countryCode: String
                            )