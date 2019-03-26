Feature: admin search an employee

Scenario: admin search an employee scenario

Given admin is already on Login page 
When title of login page is Orange_HRM
Then admin enters username and password
| username | password |
| admin    | admin123 |

Then admin clicks on login button
Then admin is on dashboard page
Then admin moves to PIM page
Then admin enters search details
| employee Name	 | ID   | Supervisor |
| Linda Anderson | 0001 | John Smith |
| Robert Craig   | 0006 | John Smith |
| Steven Edwards | 0004 | John Smith |

Then admin click search button
Then Close the browser