Feature: Check the correct behavior of the new tasks features.

  Scenario: Test Case 01: Create new task PAID and OPEN
    Given Victor want create a new task in Android 13 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 02: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 13 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 03: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 13 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 04: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 13 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 05: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 13 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 06: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 13 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 07: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 13 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 08: Create new wrong task
    Given Victor want create a new task in Android 13 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 09: Edit existent task
    Given Victor want edit a created task in Android 13 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 10: Delete existent task
    Given Victor want delete a created task in Android 13 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 11: Create new task PAID and OPEN
    Given Victor want create a new task in Android 12 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 12: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 12 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 13: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 12 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 14: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 12 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 15: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 12 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 16: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 12 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 17: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 12 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 18: Create new wrong task
    Given Victor want create a new task in Android 12 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 19: Edit existent task
    Given Victor want edit a created task in Android 12 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 20: Delete existent task
    Given Victor want delete a created task in Android 12 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 21: Create new task PAID and OPEN
    Given Victor want create a new task in Android 11 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 22: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 11 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 23: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 11 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 24: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 11 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 25: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 11 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 26: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 11 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 27: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 11 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 28: Create new wrong task
    Given Victor want create a new task in Android 11 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 29: Edit existent task
    Given Victor want edit a created task in Android 11 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 30: Delete existent task
    Given Victor want delete a created task in Android 11 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 31: Create new task PAID and OPEN
    Given Victor want create a new task in Android 10 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 32: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 10 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 33: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 10 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 34: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 10 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 35: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 10 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 36: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 10 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 37: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 10 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 38: Create new wrong task
    Given Victor want create a new task in Android 10 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 39: Edit existent task
    Given Victor want edit a created task in Android 10 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 40: Delete existent task
    Given Victor want delete a created task in Android 10 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 41: Create new task PAID and OPEN
    Given Victor want create a new task in Android 9 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 42: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 9 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 43: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 9 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 44: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 9 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 45: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 9 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 46: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 9 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 47: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 9 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 48: Create new wrong task
    Given Victor want create a new task in Android 9 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 49: Edit existent task
    Given Victor want edit a created task in Android 9 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 50: Delete existent task
    Given Victor want delete a created task in Android 9 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 51: Create new task PAID and OPEN
    Given Victor want create a new task in Android 8 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 52: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 8 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 53: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 8 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 54: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 8 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 55: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 8 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 56: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 8 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 57: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 8 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 58: Create new wrong task
    Given Victor want create a new task in Android 8 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 59: Edit existent task
    Given Victor want edit a created task in Android 8 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 60: Delete existent task
    Given Victor want delete a created task in Android 8 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 61: Create new task PAID and OPEN
    Given Victor want create a new task in Android 7 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 62: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 7 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 63: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 7 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 64: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 7 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 65: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 7 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 66: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 7 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 67: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 7 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 68: Create new wrong task
    Given Victor want create a new task in Android 7 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 69: Edit existent task
    Given Victor want edit a created task in Android 7 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 70: Delete existent task
    Given Victor want delete a created task in Android 7 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 71: Create new task PAID and OPEN
    Given Victor want create a new task in Android 6 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 72: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 6 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 73: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 6 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 74: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 6 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 75: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 6 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 76: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 6 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 77: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 6 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 78: Create new wrong task
    Given Victor want create a new task in Android 6 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 79: Edit existent task
    Given Victor want edit a created task in Android 6 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 80: Delete existent task
    Given Victor want delete a created task in Android 6 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 81: Create new task PAID and OPEN
    Given Victor want create a new task in Android 5 version
    When He fill CORRECT the new task PAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 82: Create new task UNPAID and OPEN
    Given Victor want create a new task in Android 5 version
    When He fill CORRECT the new task UNPAID and OPEN form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 83: Create new task PAID and INPROGRESS
    Given Victor want create a new task in Android 5 version
    When He fill CORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 84: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 5 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 85: Create new task PAID and CLOSE
    Given Victor want create a new task in Android 5 version
    When He fill CORRECT the new task PAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 86: Create new task UNPAID and CLOSE
    Given Victor want create a new task in Android 5 version
    When He fill CORRECT the new task UNPAID and CLOSE form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 87: Create new task UNPAID and INPROGRESS
    Given Victor want create a new task in Android 5 version
    When He fill CORRECT the new task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 88: Create new wrong task
    Given Victor want create a new task in Android 5 version
    When He fill INCORRECT the new task PAID and INPROGRESS form
    Then the task SHOULD_NOT be in tasks list

  Scenario: Test Case 89: Edit existent task
    Given Victor want edit a created task in Android 5 version
    When He edit the new task
    When He edit CORRECT the task UNPAID and INPROGRESS form
    Then the task SHOULD be in tasks list

  Scenario: Test Case 90: Delete existent task
    Given Victor want delete a created task in Android 5 version
    When He delete the new task
    Then the task SHOULD_NOT be in tasks list

