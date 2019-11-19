package teja_123.example.android.ecomstatic.Services

import teja_123.example.android.ecomstatic.Model.Categories
import teja_123.example.android.ecomstatic.Model.products

object DataService {

    val categories= listOf(Categories("SHIRTS","shirtimage"),
                            Categories("HATS","hatimage"),
                            Categories("HOODIES","hoodieimage"),
                            Categories("DIGITAL","digitalgoodsimage")
    )

    val shirts= listOf(products("Devslopes shirt01","14$","shirtimg01"),products("Devslopes shirt02","16$","shirtimg02"),products("Devslopes shirt03","18$","shirtimg03"),products("Devslopes shirt04","18$","shirtimg04"),products("Devslopes shirt05","20$","shirtimg05"))

    val hoodies= listOf(products("Devslopes hoodie01","14$","hoodieimg01"),products("Devslopes hoodie02","16$","hoodieimg02"),products("Devslopes hoodie03","18$","hoodieimg03"),products("Devslopes hoodie04","18$","hoodieimg04"),products("Devslopes hoodie05","20$","hoodieimg05"))

    val hats= listOf(products("Devslopes hat01","14$","hatimg01"),products("Devslopes hat02","16$","hatimg02"),products("Devslopes hat03","18$","hatimg03"),products("Devslopes hat04","18$","hatimg04"),products("Devslopes hat05","20$","hatimg05"))

    val digital= listOf(products("Devslopes digital01","14$","digitalimg01"),products("Devslopes digital02","16$","digitalimg02"),products("Devslopes digital03","18$","digitalimg03"),products("Devslopes digital04","18$","digitalimg04"),products("Devslopes digital05","20$","digitalimg05"))
}