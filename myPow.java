public double myPow(double x, int n) {
        long nn=n;
        if(n<0)nn*=-1;
        double ans= myPower(1,x,nn);
        if(n<0)ans=(double)1/(double)ans;
        return ans;
    }
    public double myPower(double pro,double x,long n){
    if(n<=0) return pro;
    if(n%2==1){
        return myPower(pro*x,x,n-1);
    }
    else return myPower(pro,x*x,n/2);
    }
