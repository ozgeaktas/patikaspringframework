package com.ozgeaktas.patikaspring.cdi;


import jakarta.enterprise.context.*;
import jakarta.inject.Named;

//kapsam
//yaşam süresi
@Named
//@ApplicationScoped // bütün uygulama boyunca çalışıyor. bütün kullanıcılar için.
//@RequestScoped // 1 istek boyunca
//@SessionScoped // 1 kullanıcı için yaşar ancak logout olunca ölür
//@Dependent // Bulunmuş olduğu yapı hangi scope taysa onu sağlar. Çağırdığımız yere göre değişir.
//@ConversationScoped // belli istek boyunca yaşar.Örnek: ürünü sepete ekle ödemeni yap ürün durmasına gerek yok.
public class _00_Scoped {
}
