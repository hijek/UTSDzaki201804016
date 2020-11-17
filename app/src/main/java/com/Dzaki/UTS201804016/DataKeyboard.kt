package com.Dzaki.UTS201804016

object DataKeyboard {
    private val namaKeyboard = arrayOf(
        "SteelSeries Apex Pro",
        "SteelSeries Apex 7 TKL",
        "Razer Blackwidow X Chroma",
        "Razer Hunsman",
        "Razer Blackwidow Chroma",
        "Ducky One 2 RGB",
        "Logitech G Pro X TKL",
        "HyperX Alloy FPS",
        "Razer Ornata Chroma",
        "Corsair K65 RGB LUX ",
        "Ducky One 2 Midnight",
        "Digital Alliance Meca Z",
        "Sades Phoenix",
        "Digital Alliance Meca Master",
        "Techware Phantom P87 TKL",
        "Digital Alliance Meca Shield Rainbowy",
        "Digital Alliance Meca Fighter Ice",
        "Keychron K8 TKL Hotswap wireless",
        "Keychron K2 Wireless",
        "Keychron K4 Wireless"
    )

    private val hargaKeyboard = arrayOf(
        "Rp 3.220.000",
        "Rp 2.180.000",
        "Rp 2.100.000",
        "Rp 2.059.000",
        "Rp 2.050.000",
        "Rp 2.040.000",
        "Rp 1.930.000",
        "Rp 1.690.000",
        "Rp 1.570.000",
        "Rp 1.549.000",
        "Rp 1.495.000",
        "Rp 899.000",
        "Rp 590.000",
        "Rp 535.000",
        "Rp 625.000",
        "Rp 350.000",
        "Rp 319.000",
        "Rp 1.349.000",
        "Rp 1.150.000",
        "Rp 1.399.000"
    )

    private val logoKeyboard = intArrayOf(
        R.drawable.k1,
        R.drawable.k2,
        R.drawable.k3,
        R.drawable.k4,
        R.drawable.k5,
        R.drawable.k6,
        R.drawable.k7,
        R.drawable.k8,
        R.drawable.k9,
        R.drawable.k10,
        R.drawable.k11,
        R.drawable.k12,
        R.drawable.k13,
        R.drawable.k14,
        R.drawable.k15,
        R.drawable.k16,
        R.drawable.k17,
        R.drawable.k18,
        R.drawable.k19,
        R.drawable.k20
    )

    val listData: ArrayList<Keyboard>
        get() {
            val listKeyboard = arrayListOf<Keyboard>()
            for (position in namaKeyboard.indices){
                val KeyboardA = Keyboard()
                KeyboardA.produkk = namaKeyboard[position]
                KeyboardA.hargak = hargaKeyboard[position]
                KeyboardA.logok = logoKeyboard[position]
                listKeyboard.add(KeyboardA)
            }
            return listKeyboard
        }
}