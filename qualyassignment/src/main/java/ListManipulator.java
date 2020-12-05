import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListManipulator {


    public Map<String, String> filterFileTypes(List<String> input){

        Map<String, String> result = new HashMap<String, String>();
        String audio = "";
        String video = "";
        String other = "";

        for (String s:
             input) {
            if (s.endsWith(".mp4")) {
                video += s + " ";
            } else if (s.endsWith(".wav")) {
                audio += s + " ";

            } else {
                other += s + " ";
            }
        }

        result.put("Video", video);
        result.put("Audio", audio);
        result.put("Other", other);

        return result;

    }


}
