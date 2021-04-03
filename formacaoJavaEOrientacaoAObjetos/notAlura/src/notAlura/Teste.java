package notAlura;

import com.sun.tools.javac.util.List;

public class Teste {

	public static void main(String[] args) {
		List<String> issueIDsTemp = new List<String>();
        for(String issueID : issueIDs){
            if(!alreadyProcessedIssuesList.contains(issueID)){
                issueIDsTemp.add(issueID);
            }
        }
        issueIDs = issueIDsTemp;

	}

}
