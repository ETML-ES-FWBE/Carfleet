import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    //region private attributes
    private String _name = "Einstein";
    private String _firstname = "Albert";
    private String _phonenumber = "+41793456789";
    private String _emailaddress = "ae@relativity.org";

    private ArrayList<String> _languages = new ArrayList<String>();
    private Person _person;
    //endregion private attributes

    @BeforeEach
    public void beforeEach() {
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

    @Test
    public void languages_addFirstLanguage_getCorrectUniqueLanguage(){
        //given
        String expectedLanguage = "French";
        ArrayList<String> expectedLanguages = new ArrayList<String>() { {add(expectedLanguage);} };
        assertEquals(0, _person.getLanguages().size());

        //when
        _person.setLanguages(expectedLanguages);

        //then
        ArrayList<String> actualLanguages = _person.getLanguages();
        assertEquals(expectedLanguages.size(), actualLanguages.size());
        assertEquals(expectedLanguage, actualLanguages.getFirst());
    }

    @Test
    public void languages_addMultipleLanguageAtOnce_getCorrectLlistOfLanguages(){
        //given
        ArrayList<String> expectedLanguages = new ArrayList<String>(){
            {
                add("French");
                add("Spanish");
                add("German");
            }
        };
        assertEquals(0, _person.getLanguages().size());

        //when
        _person.setLanguages(expectedLanguages);

        //then
        ArrayList<String> actualLanguages = _person.getLanguages();
        assertEquals(expectedLanguages.size(), actualLanguages.size());
        for(int i = 0; i < expectedLanguages.size(); i++){
            assertEquals(expectedLanguages.get(i), actualLanguages.get(i));
        }
    }

    @Test
    public void languages_addMultipleLanguagesInExistingLanguagesList_getCorrectListOfLanguages(){
        //given
        ArrayList<String> initialLanguages = new ArrayList<String>(){
            {
                add("French");
                add("Spanish");
                add("German");
            }
        };

        ArrayList<String> additionalLanguages = new ArrayList<String>(){
            {
                add("Vitenamese");
            }
        };

        ArrayList<String> expectedLanguages = new ArrayList<String>(){
            {
                addAll(initialLanguages);
                addAll(additionalLanguages);
            }
        };
        _person.setLanguages(initialLanguages);
        assertEquals(3, _person.getLanguages().size());

        //when
        _person.setLanguages(additionalLanguages);

        //then
        ArrayList<String> actualLanguages = _person.getLanguages();
        assertEquals(expectedLanguages.size(), actualLanguages.size());
        for(int i = 0; i < expectedLanguages.size(); i++){
            assertEquals(expectedLanguages.get(i), actualLanguages.get(i));
        }
    }

    @Test
    public void languages_addMultipleLanguagesInExistingLanguagesListWithDuplicate_getCorrectListOfLanguages() {
        //given
        ArrayList<String> initialLanguages = new ArrayList<String>(){
            {
                add("French");
                add("Spanish");
                add("German");
            }
        };

        ArrayList<String> additionalLanguages = new ArrayList<String>(){
            {
                add("French");
                add("Vitenamese");
            }
        };

        ArrayList<String> expectedLanguages = new ArrayList<String>(){
            {
                addAll(initialLanguages);
                add("Vitenamese");
            }
        };

        _person.setLanguages(initialLanguages);
        assertEquals(3, _person.getLanguages().size());

        //when
        _person.setLanguages(additionalLanguages);

        //then
        ArrayList<String> actualLanguages = _person.getLanguages();
        assertEquals(expectedLanguages.size(), actualLanguages.size());
        for(int i = 0; i < expectedLanguages.size(); i++){
            assertEquals(expectedLanguages.get(i), actualLanguages.get(i));
        }
    }
}