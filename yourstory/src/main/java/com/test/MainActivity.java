package com.test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private Banner ban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ban = findViewById(R.id.ban);

        init();

    }

    private void init() {

        List<String> list = new ArrayList<String>();
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/n36fYC4n*2wj4Ryj0JynV2*aS43urPt*SGlAfKnvjAY!/m/dDIBAAAAAAAAnull&bo=EwKUAgAAAAADB6U!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/pqPnkSbga1X59*MGWk7QvGeWzqMHt0foH**phv22wfc!/m/dL4AAAAAAAAAnull&bo=FAK*AgAAAAADB4k!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/DnZ8MFkup59OqCZdspVR4FP0h*8WNo5KC*46rKLRr2U!/m/dFQBAAAAAAAAnull&bo=EgKyAgAAAAADB4I!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/0fh5qPhxS*24qWqYVEdOrNxOLTyKeZ4RBzeg1TNz*hA!/m/dL8AAAAAAAAAnull&bo=GALBAgAAAAADB*s!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/QlB8iZPPRDcbjTsGlHMqrsnYovEeev9SELmT9Zq01Ms!/m/dL8AAAAAAAAAnull&bo=FQLNAgAAAAADB*o!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/5YmcPbhJNUdITklWGV4nsZTbwwURlSRG5ZqjCV*43*8!/m/dLgAAAAAAAAAnull&bo=GQLkAgAAAAADB98!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/GjriWXjTFmH6e7BIeQLHviM.dqKXInvEvYGAXPynGlo!/m/dL8AAAAAAAAAnull&bo=FALiAgAAAAADB9Q!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/9shiiawhGL8qKbcoRkRkb9UOu32959GpRoHbd4uczqE!/m/dMAAAAAAAAAAnull&bo=FgLeAgAAAAADB.o!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/iP7IosWvXUPhd2I*hNQxP3vbFP09HlDCKZo7Z2Pwyro!/m/dL8AAAAAAAAAnull&bo=FgLdAgAAAAADB.k!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/bMR0b8OK2tfjwMz*iUcm0Og6yQY1BHSMKdalrbyUg5g!/m/dL8AAAAAAAAAnull&bo=FgLdAgAAAAADB.k!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/FpC6BJD96DUpn1.Qs7WT9XD92Dmo1DOSsdwQXh1x0TU!/m/dFMBAAAAAAAAnull&bo=FQLYAgAAAAADB.8!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/NNeIpnwIo4Bur33x2XEnjbi7iycKXyzLY73yZh974NU!/m/dFIBAAAAAAAAnull&bo=FwLZAgAAAAADB.w!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/kDUswu6JxdtflRBzECFQQYcvF*OSZpjbjYucbLui6wU!/m/dLkAAAAAAAAAnull&bo=EALaAgAAAAADB.g!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/oo0Dsr3Mjzy.AQ7SYvvAjS7CEjyBOIRY1sa2vcdMoqE!/m/dFQBAAAAAAAAnull&bo=GALVAgAAAAADB.8!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/6MW8a*5fUwrr6z7sUYW1CEJCXOteR4YCqrnXKKtjl6s!/m/dDcBAAAAAAAAnull&bo=EwLUAgAAAAADB.U!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/osLOAlLL3DFWqeX*8dRLpDYlV1wSTuyCY8d7m86kVx4!/m/dL8AAAAAAAAAnull&bo=FQLgAgAAAAADB9c!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/RY5upo9*ogo*CRUYB94ugbQ4M043z4Hvo*NqlOYYQbc!/m/dFMBAAAAAAAAnull&bo=EALWAgAAAAADB.Q!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/WTLwSxWkUVTxUZRfvpJcr.iBo32j1TvCAnn59u1Sw5Y!/m/dL8AAAAAAAAAnull&bo=FQLeAgAAAAADB.k!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/hn7fGP9uJMBVtSPZ92h9LtYcHy9cz5UFd3PCHVrdF4s!/m/dLYAAAAAAAAAnull&bo=FAKQAgAAAAADB6Y!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/I.3Ka4CG3z1nKDCJ5mdYgVboUJUm5nanuLKMpdrCJFE!/m/dFMBAAAAAAAAnull&bo=FALdAgAAAAADB.s!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/UiPSK8Ud3B1Q4*itOVmAUr1zbJ3XB1.SaVhCx06O5UU!/m/dLYAAAAAAAAAnull&bo=EgLfAgAAAAADB.8!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/JZNCLsdaHiKS7v8hviWy7ea0NpDmFAoCO7n3XO3JMX4!/m/dLYAAAAAAAAAnull&bo=FALlAgAAAAADB9M!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/9e1*TFnEEMhqSRFVJM8J9wsF9ZC.FZ*LFjzVgow*1hE!/m/dL4AAAAAAAAAnull&bo=FAK3AgAAAAADB4E!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/550LSp4z8lnDCPk87bpLLAI60yOD*tBIlP0eNV0ra*8!/m/dDABAAAAAAAAnull&bo=FgLkAgAAAAADB9A!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/ycO*yUrLn*95t8CzU286YAtItZ1*XwcfwAGJDhFEL9U!/m/dMEAAAAAAAAAnull&bo=FQLbAgAAAAADB.w!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/J23VWyDbb*YuOZQMW2mAkuopZ1DcMEDU0U6A8fXVaNE!/m/dL8AAAAAAAAAnull&bo=EwLgAgAAAAADB9E!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/y*eEt4FIoa.YxidOXnC76pEenUqVElHaKw6epKVoj3E!/m/dL8AAAAAAAAAnull&bo=FQLeAgAAAAADB.k!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/jehsJmBVvIirvqNWrLKFcvI1tVPK9luCz5i8My8fTks!/m/dL8AAAAAAAAAnull&bo=FALLAgAAAAADB*0!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/UaSJro2sCcmU0h.hZ*vVDJ1nJTFLVYWXx2wNfdHBfj4!/m/dLwAAAAAAAAAnull&bo=FQK7AgAAAAADB4w!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/9J*EIcjuoZh6HudJz7hHm8X6ub62kdxm*lLV.YDsnCM!/m/dL8AAAAAAAAAnull&bo=FALoAgAAAAADB94!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/q4Z*BfTSQfEU8N0npd6Dpg2u3OT6BR3q2yrZFvANTW0!/m/dLYAAAAAAAAAnull&bo=FgLlAgAAAAADB9E!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/toZlDGiO9crQ.MK1TQ6OAuCgh2NTEk.vYVAsrGdR8YE!/m/dLYAAAAAAAAAnull&bo=YwHZAgAAAAADB5s!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/pUwad7h.WgL6INwOrug8oY0MfR4m9*k6ONeHepv1bJU!/m/dDIBAAAAAAAAnull&bo=FQK7AgAAAAADB4w!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/RDVpD4*Y55QPBrvXKl4jhPKHStjzYaKKOQ6He6sZZPs!/m/dLYAAAAAAAAAnull&bo=FgKtAgAAAAADB5k!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/pRzfQLeiHecGvvLnpmSxYp7eBj2C*Q1BjvpY6MXJ58s!/m/dL8AAAAAAAAAnull&bo=FwKkAgAAAAADB5E!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/e1CG6y3Ey7ii77IG2RT.0p79QX26o95A9o4uMU01zII!/m/dFIBAAAAAAAAnull&bo=GQLHAgAAAAADB*w!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/J5v0wedNBhaw7.YcTmohEZ4Mk1k6cpVqSej00KUvAxw!/m/dL4AAAAAAAAAnull&bo=FgLIAgAAAAADB*w!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/A.plf*J9Ff1oNXSpu1UVif2aDPjOvyl6H3z7Mhyc954!/m/dLYAAAAAAAAAnull&bo=EwLKAgAAAAADB*s!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/03sQ*4SMi5EjBAnduBLVj8qSx8R9TlMU37McDcUN35U!/m/dLkAAAAAAAAAnull&bo=GAJmAgAAAAADB1w!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/O*.L3YKcYQmJQvj2t2YgFMX5bpSxTQJDFZE17M8t1AA!/m/dL8AAAAAAAAAnull&bo=EwLPAgAAAAADB*4!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/zJJHQ19Ufs5VPUXL4JfKVWlJnjeJdogC4A9IY5.VVyo!/m/dL8AAAAAAAAAnull&bo=FALSAgAAAAADB.Q!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/v.yeCUBidS2jxmTR5s*LU1WkQdiFaPIcM00AKxXicrY!/m/dL4AAAAAAAAAnull&bo=FwKtAgAAAAADB5g!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/YUcTY6e9om0XSngzD.tFh1B3FOIdkb6F6lyvGGGrdL8!/m/dL8AAAAAAAAAnull&bo=GALVAgAAAAADB.8!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/pQfydtL*cDDxH4.BLg3WxdSBQUlcx1dSFg62cavjmDw!/m/dFMBAAAAAAAAnull&bo=FgKhAgAAAAADB5U!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/wBZw86cYCNq7jfjDAKTL2xCU*R7EMQr9ObDZTS2lM8Q!/m/dL4AAAAAAAAAnull&bo=FQLWAgAAAAADB.E!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/47hiXnEqbx0nF5zMYOwg9ZrN7Jb3xP1WkwcWfFh4M18!/m/dLkAAAAAAAAAnull&bo=GALTAgAAAAADB.k!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/izndNq8c*CaaduqucaE0uFqJLmYRFTiLIv*RK60efhU!/m/dLgAAAAAAAAAnull&bo=FgLmAgAAAAADB9I!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/LmN0GxWVN*NLbE5btrFcVZOdCSBF1Ka6mhTPPDVWt68!/m/dLYAAAAAAAAAnull&bo=FgLaAgAAAAADB.4!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/jhWklYvkE8PEymeenzdp9.PHq8HWVIsPHPnXQqY5CYU!/m/dL8AAAAAAAAAnull&bo=FQLXAgAAAAADB.A!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/ZXrY.riQBMCjaNriv7cH6.lV6QDVTZdKRLNKYQvCDac!/m/dMMAAAAAAAAAnull&bo=EQLXAgAAAAADB.Q!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/xJIJ1NEjtzTipCnxLwl*CWJ*BCxSzguRyjYXNNUUbQ8!/m/dMEAAAAAAAAAnull&bo=FAKXAgAAAAADB6E!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/.B5mQhVMkpQacECPfK.H9ngzyOxKEvQm1WH4F5cB49Y!/m/dLYAAAAAAAAAnull&bo=FgLeAgAAAAADB.o!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/IaC8iBHqDDLAY3jSFGsQY53ljwiRYNVtw4rufrzaWiU!/m/dDUBAAAAAAAAnull&bo=FwLoAgAAAAADB90!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/99SAyLe4o4tjGYJC9e5DbV*spb4ywkezA93LfV4z6A4!/m/dL4AAAAAAAAAnull&bo=FwLeAgAAAAADB.s!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/HnivpbrgtLmCMz4dlzi50FMV2fbCGIB4Ycz0M0GhJdc!/m/dLkAAAAAAAAAnull&bo=FgLWAgAAAAADB.I!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/8VBmRR7d48BE27GvEgnClnq4rhRKlcNyUX.28Tb0Jco!/m/dL8AAAAAAAAAnull&bo=FwLVAgAAAAADB.A!&rf=photolist&t=5");
        list.add("http://a2.qpic.cn/psb?/V11PmUbu4MW7zW/jWu4oXleYrII2Ys.w6dgzMDCVvl.IbkvG*c270y5QLQ!/m/dMEAAAAAAAAAnull&bo=EgLXAgAAAAADB.c!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/Yrp5QOuYHXDaLvTyLgxEr*O0EMefJK7rRMI2VuE8**w!/m/dL8AAAAAAAAAnull&bo=EwLUAgAAAAADB.U!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/oXju08DkjqmpfOhvuchdbPlXxKN8WkAWajUXwGABHj8!/m/dMAAAAAAAAAAnull&bo=EgLTAgAAAAADB.M!&rf=photolist&t=5");
        list.add("http://a4.qpic.cn/psb?/V11PmUbu4MW7zW/vW91*HKgD2vtxBvO5UcVIJte4TkKMWKkpAyIwmttOVY!/m/dL8AAAAAAAAAnull&bo=EwKYAgAAAAADB6k!&rf=photolist&t=5");
        list.add("http://a1.qpic.cn/psb?/V11PmUbu4MW7zW/OIrP4HzIq8kdtBUDDBEy7DHN2XZ4IWowztxjV8GPCTg!/m/dLgAAAAAAAAAnull&bo=FALjAgAAAAADB9U!&rf=photolist&t=5");
        list.add("http://a3.qpic.cn/psb?/V11PmUbu4MW7zW/LUba8ZUwZZ5jz0MPR1Z3L.m3Pzn3i6W9Gq4AyfV4Ow0!/m/dDYBAAAAAAAAnull&bo=FQLBAgAAAAADB*Y!&rf=photolist&t=5");
        ban.isAutoPlay(true).setDelayTime(3000).setImages(list).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        }).start();
    }
}
