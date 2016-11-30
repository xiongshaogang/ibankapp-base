/*
 * iBankApp
 *
 * License : Apache License,Version 2.0, January 2004
 *
 * See the LICENSE file in English or LICENSE.zh_CN in chinese
 * in the root directory or <http://www.apache.org/licenses/>.
 */

package org.ibankapp.base.events;

public interface EventProducer {

    <E extends Event,C extends EventConsumer> void addListener(Class<E> clazz, C consumer);

    <E extends Event,C extends EventConsumer> void removeListener(Class<E> clazz, C consumer);

}
