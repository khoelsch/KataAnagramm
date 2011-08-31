package foo;

import java.io.*;
import java.util.*;

/**
 * Find anagrams (= String permutations) in a file and print out all anagrams of the same char set.
 *
 * @see <a hrerf="http://codekata.pragprog.com/2007/01/kata_six_anagra.html">Kata description of "Prag Dave".</a>
 */
public class AnagramFinder {
    /**
     * maps an hash of a sorted char array (the former word form the file ) on
     * the list of anagrams:
     *
     *   hash -> Words from file
     */
    private final Map<Integer, Collection<String>> anagrams = new HashMap<Integer, Collection<String>>();

  String[] readWordsFromFile(File file) throws IOException {
    final BufferedReader bufReader = new BufferedReader(new FileReader(file));
    final ArrayList<String> lines = new ArrayList<String>();

    String line = bufReader.readLine();
    while (line != null) {
      lines.add(line);
      line = bufReader.readLine();
    }

    return lines.toArray(new String[lines.size()]);
  }

    String hashAndSaveWord(final String word) {
       return null;
    }

    Collection<String> getAnagramsForWord(String word) {
      return null;
    }
}
