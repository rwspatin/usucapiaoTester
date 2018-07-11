/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.UsucapiaoJudicialExtraordinarioServlet;
import javax.servlet.http.HttpServletRequest;
import junit.framework.TestCase;
import static org.easymock.EasyMock.*;

/**
 *
 * @author rwspa
 */

public class UsucapiaoJudicialExtraordinarioTest extends TestCase{
    public void testUsucapiaoFail1() {
        HttpServletRequest requestMock = createMock(HttpServletRequest.class);
        expect(requestMock.getParameter("vAltura")).andReturn("1");
        expect(requestMock.getParameter("vPeso")).andReturn("20");
        expect(requestMock.getParameter("vIMC")).andReturn("20");
        replay(requestMock);

        UsucapiaoJudicialExtraordinarioServlet usucapiao = new UsucapiaoJudicialExtraordinarioServlet();
        assertFalse(usucapiao);
    }
}