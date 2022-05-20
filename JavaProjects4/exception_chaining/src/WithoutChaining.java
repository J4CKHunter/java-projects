public class WithoutChaining {
    public static void main(String[] args) throws Exception {

        getPermission();

    }

    public static void getPermission() throws NoPermissionGrantedException{
        try{
            howIsTeamLead();
        }catch (TeamLeadUpsetException e){
            e.printStackTrace();
            throw new NoPermissionGrantedException("Permission denied");
        }
    }

    public static void howIsTeamLead() throws TeamLeadUpsetException{
        throw new TeamLeadUpsetException("Team Lead is Upset about it");
    }

}
