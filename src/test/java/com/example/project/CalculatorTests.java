/*
 * Copyright 2015-2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("1 - 1 = 0")
	void substractTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.substract(1, 1), "1 - 1 should equal 0");
	}

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	
	@Test
	@DisplayName("3 x 3 = 9")
	void multiplyTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(9, calculator.multiply(3, 3), "3 x 3 should equal 9");
	}

	@Test
	@DisplayName("4 / 2 = 2")
	void divTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.div(2, 2), "2 / 2 should equal 1");
	}

}
