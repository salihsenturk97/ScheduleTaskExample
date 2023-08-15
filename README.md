# Spring Boot Scheduler Örnek Projesi

# Scheduler Nedir ?

Scheduler, belirli görevleri belirli zaman dilimlerinde veya tekrarlayan aralıklarla otomatik olarak yönetmek ve çalıştırmak için kullanılan bir programlama aracıdır. Bir zamanlayıcı, önceden belirlenmiş plana göre işlemleri yürütmek ve otomatik görevleri gerçekleştirmek için kullanılır.
## Kuponları Zamanında Gönderme Senaryosu

Günün belirli saatlerinde belirli müşterilere kuponlar göndermek istediğinizi hayal edin. Scheduler, her gün belirli saatlerde otomatik olarak belirli kuponları seçip ilgili müşterilere göndermek için kullanılabilir.

## Veritabanı Temizliği ve Bakımı Senaryosu

Belirli zaman aralıklarında veritabanını temizlemek veya belirli aralıklarla yedeklemek gerekebilir. Scheduler kullanarak bu tür bakım görevlerini otomatikleştirebilirsiniz.

## Rapor Oluşturma Senaryosu

Her ayın sonunda belirli raporları otomatik olarak oluşturmak veya göndermek isteyebilirsiniz. Scheduler, bu raporların zamanında oluşturulmasını sağlayabilir.

## E-posta Hatırlatmaları Senaryosu

Örneğin, kullanıcıları doğum günlerinde veya önemli tarihlerde e-posta ile hatırlatmak istediğinizi düşünün. Scheduler, bu tür hatırlatmaları otomatik olarak yönetmek için kullanılabilir.

## Proje Açıklaması

Bu proje, Spring Boot Scheduler'ı kullanarak programatik olarak ve cron tabanlı olarak görevlerin nasıl zamanlandığını göstermektedir. 

Cron tabanlı zamanlanmış görevi görmek için uygulamayı çalıştırdıktan sonra belirlediğiniz zamanlarda logları kontrol edebilirsiniz.

Proje içeriği şu şekildedir:
- `ProgrammaticallyScheduledTasks`: Programatik olarak görev zamanlaması yapar.
- `ScheduledTasks`: Cron tabanlı görev zamanlaması yapar.
- `SchedulerConfig`: Scheduler konfigürasyonunu tanımlar.

## Gereksinimler

- Java 8 veya daha üstü
- Maven
