package db;

import java.util.Scanner;

class Inpoint implements IDb{
    @Override
    public void use(){
        Scanner in = new Scanner(System.in);
        String query = in.nextLine();
        Query q = new Query();
        String[] parsed = q.parse(query);
        q.queryAnalyze(parsed);
    };
}
