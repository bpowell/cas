/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.validation;

import static org.junit.Assert.*;

import org.jasig.cas.TestUtils;
import org.junit.Test;

/**
 * @author Scott Battaglia
 * @since 3.0.0
 */
public class Cas10ProtocolValidationSpecificationTests {

    @Test
    public void verifyRenewGettersAndSettersFalse() {
        final Cas10ProtocolValidationSpecification s = new Cas10ProtocolValidationSpecification();
        s.setRenew(false);
        assertFalse(s.isRenew());
    }

    @Test
    public void verifyRenewGettersAndSettersTrue() {
        final Cas10ProtocolValidationSpecification s = new Cas10ProtocolValidationSpecification();
        s.setRenew(true);
        assertTrue(s.isRenew());
    }

    @Test
    public void verifyRenewAsTrueAsConstructor() {
        assertTrue(new Cas10ProtocolValidationSpecification(true).isRenew());
    }

    @Test
    public void verifyRenewAsFalseAsConstructor() {
        assertFalse(new Cas10ProtocolValidationSpecification(false).isRenew());
    }

    @Test
    public void verifySatisfiesSpecOfTrue() {
        assertTrue(new Cas10ProtocolValidationSpecification(true).isSatisfiedBy(TestUtils.getAssertion(true)));
    }

    public void verifyNotSatisfiesSpecOfTrue() {
        assertFalse(new Cas10ProtocolValidationSpecification(true).isSatisfiedBy(TestUtils.getAssertion(false)));
    }

    public void verifySatisfiesSpecOfFalse() {
        assertTrue(new Cas10ProtocolValidationSpecification(false).isSatisfiedBy(TestUtils.getAssertion(true)));
    }

    public void verifySatisfiesSpecOfFalse2() {
        assertTrue(new Cas10ProtocolValidationSpecification(false).isSatisfiedBy(TestUtils.getAssertion(false)));
    }

}
