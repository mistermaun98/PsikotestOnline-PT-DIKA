Feature: Form Add Admin Test

#TCC.PO.018
Scenario: Cek input form dengan field Full Name kosong
Given Admin berada di form Add Admin
When Admin input field Privileges
And Admin input field Supervisor
And Admin input field Telephone
And Admin input field Username
And Admin input field Password
And Admin klik tombol Save
Then Muncul tampilan warning Mohon Lengkapi Data

#TCC.PO.019
Scenario: Cek input form dengan field Privileges kosong
When Admin input field Full Name
And Admin kosongkan field Privileges
And Admin klik tombol Save
Then Muncul tampilan warning Mohon Lengkapi Data

#TCC.PO.020
Scenario: Cek input form dengan field Supervisor kosong
When Admin input field Privileges
And Admin kosongkan field Supervisor
And Admin klik tombol Save
Then Muncul tampilan warning Mohon Lengkapi Data

#TCC.PO.021
Scenario: Cek input form dengan field Telephone kosong
When Admin input field Supervisor
And Admin kosongkan field Telephone
And Admin klik tombol Save
Then Muncul tampilan warning Mohon Lengkapi Data

#TCC.PO.022
Scenario: Cek input form dengan field Username kosong
When Admin input field Telephone
And Admin kosongkan field Username
And Admin klik tombol Save
Then Muncul tampilan warning Mohon Lengkapi Data

#TCC.PO.023
Scenario: Cek input form dengan field Password kosong
When Admin input field Username
And Admin kosongkan field Password
And Admin klik tombol Save
Then Muncul tampilan warning Mohon Lengkapi Data

#TCC.PO.024
@TCC24
  Scenario: Cek input form dengan password kurang dari 8 digit
  When Admin input field Full Name "test24"
  And Admin input field Privileges "Admin"
  And Admin input field Supervisor "ARIE"
  And Admin input field Telephone "1234567890"
  And Admin input field Username "uname24"
  And Admin input field Password "12345"
  And Admin klik tombol Save
  And Admin konfirmasi simpan data
  Then Muncul notifikasi Pemberitahuan Password error

#TCC.PO.025
@TCC25_Onwards
Scenario: Cek input form dengan password lebih dari 16 digit
When Admin input field Full Name "IJN Takao"
And Admin input field Privileges "Admin"
And Admin input field Supervisor "SUPER"
And Admin input field Telephone "0987673245"
And Admin input field Username "uname25"
And Admin input field Password "12345678123456781234"
And Admin klik tombol Save
And Admin konfirmasi simpan data
Then Muncul notifikasi Pemberitahuan Password error

#TCC.PO.026
@TCC25_Onwards
Scenario: Cek input form dengan password karakter angka saja
When Admin input field Full Name "IJN Choukai"
And Admin input field Privileges "Admin"
And Admin input field Supervisor "ARIE"
And Admin input field Telephone "6578801234"
And Admin input field Username "uname26"
And Admin input field Password "13572468"
And Admin klik tombol Save
And Admin konfirmasi simpan data
Then Muncul notifikasi Pemberitahuan Password error

#TCC.PO.027
@TCC25_Onwards
Scenario: Cek input form dengan password karakter huruf saja
When Admin input field Full Name "IJN Maya"
And Admin input field Privileges "Admin"
And Admin input field Supervisor "SUPER"
And Admin input field Telephone "56712345"
And Admin input field Username "uname27"
And Admin input field Password "qwerTYUI"
And Admin klik tombol Save
And Admin konfirmasi simpan data
Then Muncul notifikasi Pemberitahuan Password error

#TCC.PO.028
@TCC25_Onwards
Scenario: Cek input form dengan password karakter simbol saja
When Admin input field Full Name "HMS Belfast"
And Admin input field Privileges "Admin"
And Admin input field Supervisor "ARIE"
And Admin input field Telephone "446578890"
And Admin input field Username "uname28"
And Admin input field Password ",./*-+%!"
And Admin klik tombol Save
And Admin konfirmasi simpan data
Then Muncul notifikasi Pemberitahuan Password error

#TCC.PO.029
@TCC25_Onwards
Scenario: Cek input form dengan data valid
When Admin input field Full Name
And Admin input field Privileges
And Admin input field Supervisor
And Admin input field Telephone
And Admin input field Username
And Admin input field Password
And Admin klik tombol Save
And Admin konfirmasi simpan data
Then Data berhasil disimpan