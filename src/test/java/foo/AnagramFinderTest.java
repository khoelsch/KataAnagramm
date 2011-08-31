package foo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class AnagramFinderTest {
  private static final String RESOURCE_FOLDER = "C:\\Users\\khoelsch\\workspaces\\CodeKatas\\Anagramm-Kata\\src\\main\\resources\\";
  private AnagramFinder anaFinder;

  @Before
  public void setUp() throws Exception {
    anaFinder = new AnagramFinder();
  }

  @After
  public void tearDown() throws Exception {
    anaFinder = null;
  }

  @Test
  public void testReadFromFile() throws IOException {
    final File wordlist = new File(RESOURCE_FOLDER + "simple-wordlist.txt");
    Assert.assertEquals(3, anaFinder.readAnagrams(wordlist).length);
  }
}
