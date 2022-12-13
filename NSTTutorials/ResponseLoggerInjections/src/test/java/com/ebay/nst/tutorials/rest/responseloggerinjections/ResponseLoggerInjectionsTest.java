package com.ebay.nst.tutorials.rest.responseloggerinjections;

import com.ebay.nst.NSTServiceTestRunner;
import com.ebay.nst.NSTServiceWrapperProcessor;
import com.ebay.nst.tutorials.sharedtutorialutilities.rest.CanadaHoliday;
import com.ebay.softassert.EbaySoftAssert;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class ResponseLoggerInjectionsTest implements NSTServiceTestRunner {

    private static final String RESPONSE_LOGGER_INJECTIONS_PATH = "src/test/java/responseloggerinjectionstutorial";
    private static final String GENERATED_MOCK_PATH = RESPONSE_LOGGER_INJECTIONS_PATH + "/ResponseLoggerInjectionsTest_exampleResponseLoggerInjectionMockGenerationTest_0_ResponseLoggerInjectionsWrapper.har";

    @Test
    public void exampleResponseLoggerInjectionMockGenerationTest() throws Exception {
        // Remove any prior mocks that were generated by running the test.
        File existingMock = new File(GENERATED_MOCK_PATH);
        if (existingMock.exists()) {
            existingMock.delete();
            System.out.printf("Removed existing mock at: %s%n", GENERATED_MOCK_PATH);
        }

        NSTServiceWrapperProcessor serviceProcessor = new NSTServiceWrapperProcessor();

        // Send a GET /api/v1/holidays/{holidayId} request.
        // Set `useResponseLoggerInjector` to `false` to see the unmodified mock at path: $.holiday.date inside $.log.entries[0].response.content.text.
        boolean useResponseLoggerInjector = true;
        ResponseLoggerInjectionsWrapper restServiceWrapperWithResponseLoggerInjection = new ResponseLoggerInjectionsWrapper(CanadaHoliday.CANADA_DAY, useResponseLoggerInjector);
        serviceProcessor.sendRequestAndGetJSONResponse(restServiceWrapperWithResponseLoggerInjection);
    }

    @AfterClass
    // This assertion was added to ensure that mock generation output is successful in this tutorial.
    // This is not a required part of writing an NST test.
    public void ensureMockIsGeneratedSuccessfully() {
        File existingMock = new File(GENERATED_MOCK_PATH);
        Assert.assertTrue(existingMock.exists());
    }

    @Override
    public EbaySoftAssert getSoftAssert() {
        return null;
    }
}
