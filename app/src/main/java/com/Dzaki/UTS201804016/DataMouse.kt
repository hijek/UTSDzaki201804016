package com.Dzaki.UTS201804016

object DataMouse {
    private val NamaMouse = arrayOf(
        "Logitech G102 prodigy RGB",
        "Steelseries Rival 3",
        "Razer Viper Mini",
        "Razer Deathadder Elite",
        "Logitech G403 hero",
        "HyperX Pulsefire fps pro",
        "Logitech G502 Hero",
       "Steelseries Sensei 310",
        "Steelseries Rival 310",
        "Razer Basilisk Chroma Quartz",
        "Logitech G304",
        "Razer Lancehead",
        "Glorious Model D-",
        "Glorious Model O-",
        "Sades Schyte RGB",
        "Sades Lance",
        "Logitech G Pro Wireless",
        "Razer Mamba wireless",
        "Razer Abyssus Esesntial",
        "Logitech G703 Lightspeed wireless"
    )

    private val HargaMouse = arrayOf(
        "Rp 220.000",
        "Rp 590.000",
        "Rp 659.000",
        "Rp 849.000",
        "Rp 919.000",
        "Rp 700.000",
        "Rp 1.199.000",
        "Rp 840.000",
        "Rp 840.000",
        "Rp 530.000",
        "Rp 819.000",
        "Rp 819.000",
        "Rp 250.000",
        "Rp 165.000",
        "Rp 229.000",
        "Rp 150.000",
        "Rp 2.200.000",
        "Rp 1.550.000",
        "Rp 545.000",
        "Rp 1.479.000"
    )

    private val LogoMouse = intArrayOf(
        R.drawable.m1,
        R.drawable.m2,
        R.drawable.m3,
        R.drawable.m4,
        R.drawable.m5,
        R.drawable.m6,
        R.drawable.m7,
        R.drawable.m8,
        R.drawable.m9,
        R.drawable.m10,
        R.drawable.m11,
        R.drawable.m12,
        R.drawable.m13,
        R.drawable.m14,
        R.drawable.m15,
        R.drawable.m16,
        R.drawable.m17,
        R.drawable.m18,
        R.drawable.m19,
        R.drawable.m20
    )

    val listData: ArrayList<Mouse>
        get() {
            val ListMouse = arrayListOf<Mouse>()
            for (position in NamaMouse.indices){
                val MouseA = Mouse()
                MouseA.produkM = NamaMouse[position]
                MouseA.hargaM = HargaMouse[position]
                MouseA.logoM = LogoMouse[position]
                ListMouse.add(MouseA)
            }
            return ListMouse
        }
}