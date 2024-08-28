public class sd_1 {
    public static void main(String[] args) {
        int kq=cong(1,2,3);
        System.out.println(kq);
        xinchao("female");


    }
    public static int cong(int x, int y,int z){

        return x+y+z;
    }

    public static void xinchao(String gioitinh){
        if(gioitinh.equals("female")){
            System.out.println("xin chao,toi la nhan vien nu");
        }else if(gioitinh.equals("male")){
            System.out.println("xin cho,toi la nhan vien nam");
        }else{
            System.out.println("tôi không hiểu bạn vùa nhập gi ?");
        }
    }

}
