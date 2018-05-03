int i0, i1, i2, i3;

/*[ [ i0 = T , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        i0 = -5;

/*[ [ i0 = [-5,-5] , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        i1 = 15;

     label1:
/*[ [ i0 = [-5,6] , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        if i0 > 5 goto label2;

/*[ [ i0 = [-5,5] , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        i1 = i0 * i1;

/*[ [ i0 = [-5,5] , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        i0 = i0 + 1;

/*[ [ i0 = [-4,6] , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        goto label1;

     label2:
/*[ [ i0 = [5,6] , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        if i0 < 7 goto label3;

/*[ [ empty ]types: int,int,int,int ]*/
        i2 = i0 - 10;

/*[ [ empty ]types: int,int,int,int ]*/
        goto label4;

     label3:
/*[ [ i0 = [5,6] , i1 = T , i2 = T , i3 = T ]types: int,int,int,int ]*/
        i3 = i0 + 10;

     label4:
/*[ [ i0 = [5,6] , i1 = T , i2 = T , i3 = [10,+∞] ]types: int,int,int,int ]*/
        return;
    }
/* Output: [ i0 = [5,6] , i1 = T , i2 = T , i3 = [10,+∞] ]types: int,int,int,int */
