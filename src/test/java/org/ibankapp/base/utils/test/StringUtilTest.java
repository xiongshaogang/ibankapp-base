/*
 * iBankApp
 *
 * License : Apache License,Version 2.0, January 2004
 *
 * See the LICENSE file in English or LICENSE.zh_CN in chinese
 * in the root directory or <http://www.apache.org/licenses/>.
 */

package org.ibankapp.base.utils.test;

import org.ibankapp.base.utils.StringUtil;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testIsEmpty(){

        Assert.assertTrue(StringUtil.isEmpty(null));

        String s = "";
        Assert.assertTrue(StringUtil.isEmpty(s));

        s=" ";
        Assert.assertTrue(StringUtil.isEmpty(s));

        s="0";
        Assert.assertFalse(StringUtil.isEmpty(s));

    }

    @Test
    public void testNewStringUtil(){
        new StringUtil();
    }
}