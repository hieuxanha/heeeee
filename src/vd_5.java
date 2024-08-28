public class vd_5 {
    public static void main(String[] args) {
        abc("hieu",20);
        abc("hai",20);
        abc("vanh",20);
      int z=a2(2,65);
        System.out.println(z);
        
    }

    static void abc(String fname ,int age){
        System.out.println(fname +" is "+age);
    }


    static int a1(int x){
        return 5+x;

    }


    static int a2(int x,int y){

        return x + y;
    }
}
  try{
SimpleDateFormat datee=new SimpleDateFormat("dd/MM/yyyy");
ngaynhapvien= datee.parse(sc.nextLine());
        }catch (ParseException e){
        e.printStackTrace();
        }
                while(true){
                try{
                System.out.println("Nhập ngày ra viện (dd/MM/yyyy)");
SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
Date ngayravien=date.parse(sc.nextLine());
                if(ngayravien.before(ngaynhapvien)){
        throw new loingay("ngày ra viênj ko thể nhỏ hơn ngày nhập ");
                }
                        this.ngayravien=ngayravien;
                break;
                        }catch (ParseException e){
        e.printStackTrace();
            }catch (loingay ln){
        System.out.println(ln.getMessage());
        }
        }

