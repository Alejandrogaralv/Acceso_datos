public class Main {
    public static void main(String[] args) {
        diaSemana(1);
        diaSemana(2);
        diaSemana(3);
        diaSemana(4);
        diaSemana(5);
        diaSemana(6);
        diaSemana(7);
        try{
            diaSemanaThrows(1);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
    public static void diaSemana (int num){
        try{
            if(num==1){
                throw new Exception("Hoy es lunes");
            } else if (num==2) {
                throw new Exception("Hoy es martes");
            } else if (num==3) {
                throw new Exception("Hoy es miércoles");
            } else if (num==4) {
                throw new Exception("Hoy es jueves");
            } else if (num==5) {
                throw new Exception("Hoy es viernes");
            } else if (num==6) {
                throw new Exception("Hoy es sábado");
            } else if (num==7) {
                throw new Exception("Hoy es domingo");
            }

        }catch (Exception e){
            System.err.println(e.toString());
        }
    }  public static void diaSemanaThrows (int num) throws Exception{
            if(num==1){
                throw new Exception("Hoy es lunes");
            } else if (num==2) {
                throw new Exception("Hoy es martes");
            } else if (num==3) {
                throw new Exception("Hoy es miércoles");
            } else if (num==4) {
                throw new Exception("Hoy es jueves");
            } else if (num==5) {
                throw new Exception("Hoy es viernes");
            } else if (num==6) {
                throw new Exception("Hoy es sábado");
            } else if (num==7) {
                throw new Exception("Hoy es domingo");
            }
    }
}