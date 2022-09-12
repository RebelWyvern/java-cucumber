
#
# Copyright (C) 2021, Gherkin By Example and/or its contributors. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This software is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or
# (at your option) any later version.
#
# This code is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this code.  If not, see <https://www.gnu.org/licenses/>.
#
# Please visit Gherkin By Example at https://github.com/gherkin-by-example
# if you need additional information or have any questions.
  @system
  Feature: Probability Estimative
    As a player
    I want to know my probably at winning
    So that I know my chances

    Scenario: Run program with input

      Given The input is
      """
      1
      1
      3
      1
      0
      0
      0
      0
      """
      When Program runs
      Then The output should be
      """
      50,0

      """


    Scenario: Run program with input

      Given The input is
      """
      1
      2
      1
      1
      0
      0
      0
      0
      """
      When Program runs
      Then The output should be
      """
      3,2

      """

    Scenario: Run program with input

      Given The input is
      """
      8
      5
      3
      1
      0
      0
      0
      0
      """
      When Program runs
      Then The output should be
      """
      61,5

      """

    Scenario: Run program with input

      Given The input is
      """
      7
      5
      2
      4
      0
      0
      0
      0
      """
      When Program runs
      Then The output should be
      """
      20,0

      """

    Scenario: Run program with input

      Given The input is
      """
      0
      0
      0
      0
      """
      When Program runs
      Then The output should be
      """

      """

