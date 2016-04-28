/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.openstack.devtest.config;

import java.net.URI;

import org.jclouds.openstack.keystone.v2_0.config.KeystoneHttpApiModule;
import org.jclouds.openstack.nova.v2_0.extensions.ExtensionNamespaces;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

public class DevTestNamespaceAliasModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<URI, URI> aliases = KeystoneHttpApiModule.aliasBinder(binder());
        aliases.addBinding(URI.create(ExtensionNamespaces.KEYPAIRS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.VOLUMES)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.VOLUME_ATTACHMENTS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.VOLUME_TYPES)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.SECURITY_GROUPS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.FLOATING_IPS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.MULTINIC)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.HOSTS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.QUOTAS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.FLAVOR_EXTRA_SPECS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.FLAVOR_EXTRA_DATA)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.AVAILABILITY_ZONE)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.CREATESERVEREXT)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.VSA)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.SIMPLE_TENANT_USAGE)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.RESCUE)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.ADMIN_ACTIONS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.EXTENDED_STATUS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.DISK_CONFIG)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.CONSOLES)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.BLOCK_DEVICE_MAPPING_V2_BOOT)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.FLOATING_IP_POOLS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.ATTACH_INTERFACES)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
        aliases.addBinding(URI.create(ExtensionNamespaces.HYPERVISORS)).toInstance(URI.create("http://docs.openstack.org/compute/ext/fake_xml"));
    }
}
