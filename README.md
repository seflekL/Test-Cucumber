# 🥒 Cucumber Projesi
<br><br>
Bu proje, **Cucumber**, **JUnit**, ve **Selenium** kullanarak test otomasyonunu gerçekleştirmek için oluşturulmuştur.  
Proje, BDD (Behavior Driven Development) yaklaşımını kullanarak test senaryolarını iş birliğine uygun ve anlaşılabilir bir formatta yazmayı amaçlar.  
<br><br>

## ✨ Proje Özellikleri
<br><br>
- **Gherkin Formatı**: Test senaryolarını anlaşılır bir dilde yazma.  
- **Paralel Test Çalıştırma**: Testlerin aynı anda birden fazla thread ile çalıştırılması.  
- **Dinamik Raporlama**: JSON tabanlı test sonuçlarını detaylı görselleştirme.  
- **Excel Desteği**: Test verilerini Excel dosyalarından okuma.  
- **UI Test Otomasyonu**: Selenium WebDriver ile kullanıcı arayüzü testleri.  
<br><br>

## 📐 Kullanılan Teknolojiler ve Bağımlılıklar
<br><br>
Bu projede aşağıdaki teknolojiler kullanılmıştır:<br><br>

- **Cucumber**: BDD framework.  
- **Selenium WebDriver**: UI test otomasyonu.  
- **JUnit**: Test çalıştırma framework'ü.  
- **Maven**: Proje yönetimi ve bağımlılık yönetimi.  
- **Apache POI**: Excel dosyalarıyla çalışmak için kütüphane.  
- **JavaFaker**: Test verisi üretimi için kütüphane.  
<br><br>

## 🔧 Kurulum ve Çalıştırma
<br><br>
Projeyi yerel bilgisayarınıza klonlayın:  
`git clone https://github.com/seflekL/Test-Cucumber.git`  
<br><br>
Proje dizinine gidin:  
`cd Test-Cucumber`  
<br><br>
Maven bağımlılıklarını yükleyin:  
`mvn clean install`  
<br><br>
Testleri çalıştırın:  
`mvn test`  
<br><br>

## 📊 Proje Özellikleri
<br><br>
### Desteklenen Test Özellikleri
- **Paralel Test Çalıştırma**: Çoklu thread desteğiyle aynı anda birden fazla test çalıştırılır.  
- **Excel Entegrasyonu**: Test verileri Excel dosyalarından okunur ve işlenir.  
- **Dinamik Raporlama**: JSON rapor dosyaları kullanılarak detaylı raporlar oluşturulur.  
<br><br>

### Örnek Test Senaryosu
```gherkin
Feature: Kullanıcı Girişi

  Scenario: Doğru bilgilerle giriş yapılması
    Given Kullanıcı giriş sayfasını açar
    When Kullanıcı doğru kullanıcı adı ve şifreyi girer
    And Giriş butonuna tıklar
    Then Kullanıcı ana sayfaya yönlendirilmelidir

📫 İletişim
 GitHub: seflekL
