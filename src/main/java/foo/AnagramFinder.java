package foo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Find anagrams (= String permutations) in a file and print out all anagrams of the same char set.
 *
 * @see <a hrerf="http://codekata.pragprog.com/2007/01/kata_six_anagra.html">Kata description of "Prag Dave".</a>
 */
public class AnagramFinder {
  String[] readAnagrams(File file) throws IOException {
    final BufferedReader bufReader = new BufferedReader(new FileReader(file));
    final ArrayList<String> lines = new ArrayList<String>();

    String line = bufReader.readLine();
    while (line != null) {
      lines.add(line);
      line = bufReader.readLine();
    }

    return lines.toArray(new String[lines.size()]);
  }

}
