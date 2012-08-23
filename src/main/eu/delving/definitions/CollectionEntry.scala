package eu.delving.definitions

/**
 * The minimal set of information necessary to lookup a collection in the Directory service
 *
 * @author Manuel Bernhardt <bernhardt.manuel@gmail.com>
 */

case class CollectionEntry(uri: String,
                           name: String,
                           countryCode: String
                          )