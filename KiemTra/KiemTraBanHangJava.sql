Create database BANHANG
Go
Use BANHANG
Go
Create Table ChatLieu
(
	Machatlieu varchar(10) primary key,
	Tenchatlieu nvarchar(100) not null
)
Go
Create Table Hang
(
	Mahang varchar(10) primary key,
	Tenhang nvarchar(100) not null,
	Soluong int not null,
	Dongianhap money not null,
	Dongiaban money not null,
	Anh varchar(100) not null,
	Ghichu nvarchar(100) not null,
	Machatlieu varchar(10) not null foreign key references Chatlieu(Machatlieu)
	On update cascade
	On delete cascade
)
Go
Create Table Khach
(
	Makhach varchar(10) primary key,
	Tenkhach nvarchar(100) not null,
	Diachi nvarchar(100) not null,
	Dienthoai varchar(12) not null
)
Go
Create Table Nhanvien
(
	Manhanvien varchar(10) primary key,
	Tennhanvien nvarchar(100) not null,
	Gioitinh bit not null,
	Diachi nvarchar(100) not null,
	Dienthoai varchar(12) not null,
	Ngaysinh date not null
)
Go
Create Table HDBan
(	
	MaHDBan varchar(10) primary key,
	Ngayban date not null,
	Tongtien money not null,
	Makhach varchar(10) foreign key references Khach(Makhach),
	Manhanvien varchar(10) foreign key references Nhanvien(Manhanvien)
)
Go
Create Table ChitietHDBan
(
	MaHDBan varchar(10) foreign key references HDBan(MaHDBan),
	Mahang varchar(10) foreign key references Hang(Mahang),
	Soluong int not null,
	Dongia money not null,
	Giamgia decimal(2,0) not null,
	Thanhtien money not null,
	constraint PK_ChitietHDBan primary key (MaHDBan,Mahang) 
)
Go
---------------------------------------------------------------------------------
Create Proc Khach_Them
	@Makhach varchar(10),
	@Tenkhach nvarchar(100),
	@Diachi nvarchar(100),
	@Dienthoai varchar(12)
As
Begin
	Insert Into Khach Values(@Makhach, @Tenkhach, @Diachi, @Dienthoai) 
End
Go
Create Proc Khach_Sua
	@Makhach varchar(10),
	@Tenkhach nvarchar(100),
	@Diachi nvarchar(100),
	@Dienthoai varchar(12)
As
Begin
	Update Khach Set Tenkhach = @Tenkhach, Diachi = @Diachi, Dienthoai = @Dienthoai
	Where Makhach = @Makhach
End
Go
Create Proc Khach_Xoa
	@Makhach varchar(10)
As
Begin
	Delete From Khach
	Where Makhach = @Makhach
End
Go
Create Proc Khach_Ds
As
Begin
	Select	*
	From Khach
End
-------------------------------------------------------------------------------
Go
Create Proc Nhanvien_DS
As
Begin
	Select * From Nhanvien
End
Go
Create Proc Nhanvien_Them
	@Manhanvien varchar(10),
	@Tennhanvien nvarchar(100),
	@Gioitinh bit, 
	@Diachi nvarchar(100),
	@Dienthoai varchar(12),
	@Ngaysinh date
As
Begin
	Insert Into Nhanvien Values (@Manhanvien, @Tennhanvien, @Gioitinh, @Diachi, @Dienthoai, @Ngaysinh)
End
Go
Create Proc Nhanvien_Sua
	@Manhanvien varchar(10),
	@Tennhanvien nvarchar(100),
	@Gioitinh bit, 
	@Diachi nvarchar(100),
	@Dienthoai varchar(12),
	@Ngaysinh date
As
Begin
	Update Nhanvien set Tennhanvien = @Tennhanvien, Gioitinh = @Gioitinh, Diachi = @Diachi, Dienthoai = @Dienthoai, Ngaysinh = @Ngaysinh
	Where Manhanvien = @Manhanvien
End
Go
Create Proc Nhanvien_Xoa
	@Manhanvien varchar(10)
As
Begin
	Delete From Nhanvien
	Where Manhanvien = @Manhanvien
End
---------------------------------------------------------------------------------
Go
-------------------------------------------------------------------------------
Go
Create Proc Chatlieu_DS
As
Begin
	Select * From ChatLieu
End
Go
Create Proc Chatlieu_Them
	@Machatlieu varchar(10),
	@Tenchatlieu nvarchar(100)	
As
Begin
	Insert Into ChatLieu Values (@Machatlieu, @Tenchatlieu)
End
Go
Create Proc Chatlieu_Sua
	@Machatlieu varchar(10),
	@Tenchatlieu nvarchar(100)
As
Begin
	Update ChatLieu set Tenchatlieu = @Tenchatlieu
	Where @Machatlieu = @Machatlieu
End
Go
Create Proc Chatlieu_Xoa
	@Machatlieu varchar(10)
As
Begin
	Delete From ChatLieu
	Where Machatlieu = @Machatlieu
End
---------------------------------------------------------------------------------
Go
-------------------------------------------------------------------------------
Go
Create Proc HDBan_DS
As
Begin
	Select * From HDBan
End
Go
Create Proc HDBan_Them
	@MaHDBan varchar(10),
	@Ngayban date,
	@Tongtien money,
	@Makhach varchar(10),
	@Manhanvien varchar(10)
As
Begin
	Insert Into HDBan Values (@MaHDBan, @Ngayban, @Tongtien, @Makhach, @Manhanvien)
End
Go
Create Proc HDBan_Sua
	@MaHDBan varchar(10),
	@Ngayban date,
	@Tongtien money,
	@Makhach varchar(10),
	@Manhanvien varchar(10)
As
Begin
	Update HDBan set Ngayban = @Ngayban, Tongtien = @Tongtien, Makhach = @Makhach, Manhanvien = @Manhanvien
	Where MaHDBan = @MaHDBan
End
Go
Create Proc HDBan_Xoa
	@MaHDBan varchar(10)
As
Begin
	Delete From HDBan
	Where MaHDBan = @MaHDBan
End
---------------------------------------------------------------------------------
Go
-------------------------------------------------------------------------------
Go
Create Proc Hang_DS
As
Begin
	Select * From Hang
End
Go
Create Proc Hang_Them
	@Mahang varchar(10),
	@Tenhang nvarchar(100),
	@Soluong int,
	@Dongianhap money,
	@Dongiaban money,
	@Anh varchar(100),
	@Ghichu nvarchar(100),
	@Machatlieu varchar(10)
As
Begin
	Insert Into Hang Values (@Mahang, @Tenhang, @Soluong, @Dongianhap, @Dongiaban, @Anh, @Ghichu, @Machatlieu)
End
Go
Create Proc Hang_Sua
	@Mahang varchar(10),
	@Tenhang nvarchar(100),
	@Soluong int,
	@Dongianhap money,
	@Dongiaban money,
	@Anh varchar(100),
	@Ghichu nvarchar(100),
	@Machatlieu varchar(10)
As
Begin
	Update Hang set Tenhang = @Tenhang, Soluong = @Soluong, Dongianhap = @Dongianhap, Dongiaban = @Dongiaban, Anh = @Anh, Ghichu = @Ghichu, Machatlieu = @Machatlieu
	Where Mahang = @Mahang
End
Go
Create Proc Hang_Xoa
	@Mahang varchar(10)
As
Begin
	Delete From Hang
	Where @Mahang = @Mahang
End
---------------------------------------------------------------------------------
Go
Create Proc CTHoaDon_DS
As
Begin
	Select * From ChitietHDBan
End
Go
Create Proc CTHoaDon_Them
	@MaHDBan varchar(10),
	@Mahang varchar(10),
	@Soluong int,
	@Dongia money,
	@Giamgia decimal(2,0),
	@Thanhtien money
As
Begin
	Insert Into ChitietHDBan Values (@MaHDBan, @Mahang, @Soluong, @Dongia, @Giamgia, @Thanhtien)
End
Go
Create Proc CTHoaDon_Sua
	@MaHDBan varchar(10),
	@Mahang varchar(10),
	@Soluong int,
	@Dongia money,
	@Giamgia decimal(2,0),
	@Thanhtien money
As
Begin
	Update ChitietHDBan set Soluong = @Soluong, Dongia = @Dongia, Giamgia = @Giamgia, Thanhtien = @Thanhtien
	Where MaHDBan = @MaHDBan and Mahang = @Mahang
End
Go
Create Proc CTHoaDon_Xoa
	@Mahang varchar(10),
	@MaHDBan varchar(10)
As
Begin
	Delete From ChitietHDBan
	Where Mahang = @Mahang and MaHDBan = @MaHDBan
End
---------------------------------------------------------------------------------
Go
SELECT MaHDBan, Mahang FROM ChitietHDBan