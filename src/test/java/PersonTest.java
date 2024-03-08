import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    //region private attributes
    private static String _name = "Einstein";
    private static String _firstname = "Albert";
    private static String _phonenumber = "+41793456789";
    private static String _emailaddress = "ae@relativity.org";

    private static ArrayList<String> _languages = new ArrayList<String>();
    private static Person _person;
    //endregion private attributes

    @BeforeAll
    public static void beforeAll() {
        _languages = new ArrayList<String>();
        _person = new Person(_name, _firstname, _phonenumber, _emailaddress, _languages);
    }

    @Test
    public void allProperties_afterInstantiation_getCorrectValues() {
        //given
        //refer to BeforeAll method

        //when
        //refer to BeforeAll method

        //then
        assertEquals(_name, _person.getName());
        assertEquals(_firstname, _person.getFirstname());
        assertEquals(_phonenumber, _person.getPhonenumber());
        assertEquals(_emailaddress, _person.getEmailaddress());
        assertEquals(_languages, _person.getLanguages());
    }

    /* Test written in CSharp
    [Test]
    public void Languages_AddFirstLanguage_GetCorrectUniqueLanguage()
    {
        //given
        string expectedLanguage = "French";
        List<string> expectedLanguages = new List<string>() {expectedLanguage };

        //when
        _person.Languages = expectedLanguages;

        //then
        Assert.AreEqual(expectedLanguage, _person.Languages[0]);
    }

        [Test]
    public void Languages_AddMultipleLanguagesAtOnce_GetCorrectListOfLanguages()
    {
        //given
        List<string> expectedLanguages = new List<string>() { "French", "Spanish", "German" };

        //when
        _person.Languages = expectedLanguages;

        //then
        Assert.AreEqual(expectedLanguages.Count, _person.Languages.Count);
        foreach(string expectedLanguage in expectedLanguages)
        {
            bool languageExists = false;
            if(_person.Languages.Contains(expectedLanguage))
            {
                languageExists = true;
            }
            Assert.IsTrue(languageExists);
        }
    }

        [Test]
    public void Languages_AddMultipleLanguagesInExistingLanguagesList_GetCorrectListOfLanguages()
    {
        //given
        List<string> initialLanguages = new List<string>() { "French", "Spanish", "German" };
        List<string> additionalLanguages = new List<string>() { "Vietnamese"};
        List<string> expectedLanguages = new List<string>();
        expectedLanguages.AddRange(initialLanguages);
        expectedLanguages.AddRange(additionalLanguages);
        _person.Languages = initialLanguages;
        Assert.AreEqual(initialLanguages.Count, _person.Languages.Count);

        //when
        _person.Languages = additionalLanguages;

        //then
        Assert.AreEqual(expectedLanguages.Count, _person.Languages.Count);
        foreach (string expectedLanguage in expectedLanguages)
        {
            bool languageExists = false;
            if (_person.Languages.Contains(expectedLanguage))
            {
                languageExists = true;
            }
            Assert.IsTrue(languageExists);
        }
    }

        [Test]
    public void Languages_AddMultipleLanguagesInExistingLanguagesListWithDuplicate_GetCorrectListOfLanguages()
    {
        //given
        List<string> initialLanguages = new List<string>() { "French", "Spanish", "German" };
        List<string> additionalLanguages = new List<string>() { "Vietnamese" , "French" };
        List<string> expectedLanguages = new List<string>();
        expectedLanguages.AddRange(initialLanguages);
        expectedLanguages.Add("Vietnamese");
        _person.Languages = initialLanguages;
        Assert.AreEqual(initialLanguages.Count, _person.Languages.Count);

        //when
        _person.Languages = additionalLanguages;

        //then
        Assert.AreEqual(expectedLanguages.Count, _person.Languages.Count);
        foreach (string expectedLanguage in expectedLanguages)
        {
            bool languageExists = false;
            if (_person.Languages.Contains(expectedLanguage))
            {
                languageExists = true;
            }
            Assert.IsTrue(languageExists);
        }
    }
}
 */
}