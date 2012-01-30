package org.rest.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.rest.poc.web.privilege.PrivilegePaginationRESTIntegrationTest;
import org.rest.poc.web.user.UserPaginationRESTIntegrationTest;

@RunWith( Suite.class )
@SuiteClasses( { UserPaginationRESTIntegrationTest.class, PrivilegePaginationRESTIntegrationTest.class } )
public final class IntegrationPaginationRESTTestSuite{
	//
}