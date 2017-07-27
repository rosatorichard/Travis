package com.batchmates.android.travis;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Android on 7/27/2017.
 */

@RunWith(JUnit4.class)
public class TestThingy {



    String value;
    @Before
    public void before()
    {
        value="Hello Worlds!";
    }

    @Test
    public void checkText()
    {
        assertEquals(4,4);
//        onView(withId(R.id.tvTheText)).check(matches(withText(value)));
    }
}
