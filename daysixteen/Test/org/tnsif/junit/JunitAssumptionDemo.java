package org.tnsif.junit;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class JunitAssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(12==1);
	}

	@Test
	void accept() {
		Assumptions.assumeFalse(12==12);
    }
}