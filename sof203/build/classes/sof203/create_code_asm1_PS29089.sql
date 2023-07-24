use master
go
drop database QLNHATRO_PS29089_VuAnhKhoa
go
create database QLNHATRO_PS29089_VuAnhKhoa
go
use QLNHATRO_PS29089_VuAnhKhoa
go

create table LOAINHA (
	MaLoaiNha		int		not null,
	TenLoaiNha		nvarchar(50)	not null,
	constraint pk_ln primary key (maloainha)
)

create table NGUOIDUNG (
	MaNguoiDung			varchar(9),
	TenNguoiDung		nvarchar(50)		not null,
	GioiTinh			bit,
	DienThoai			varchar(20)			not null,
	DiaChi				nvarchar(100)		not null,
	Quan				nvarchar(20)		not null,
	Email				varchar(50),
	constraint pk_nd primary key (manguoidung)
)

create table NHATRO (
	MaNhaTro			varchar(9)		not null,
	MaLoaiNha			int				not null,
	NguoiLienHe			varchar(9)		not null,
	DienTich			float			not null,
	GiaPhong			money			not null,
	DiaChi				nvarchar(100)	not null,
	Quan				nvarchar(15)	not null,
	ThongTinNhaTro		nvarchar(300),
	NgayDang			date			not null,
	constraint pk_nt primary key (MaNhaTro),
	constraint fk_nt_nd foreign key (NguoiLienHe) references nguoidung(MaNguoiDung),
	constraint fk_nt_ln foreign key (MaLoaiNha) references loainha(MaLoaiNha),
	constraint check_dientich check(dientich >= 8),
	constraint check_giaphong check(giaphong >= 0)
)

create table DANHGIA (
	NguoiDanhGia		varchar(9)		not null,
	MaNhaTro			varchar(9)		not null,
	DanhGia				tinyint			not null,
	NoiDungDanhGia		nvarchar(300),
	constraint pk_dg primary key (NguoiDanhGia, MaNhaTro),
	constraint fk_dg_nd foreign key (NguoiDanhGia) references nguoidung(MaNguoiDung),
	constraint fk_dg_nt foreign key (MaNhaTro) references nhatro(MaNhaTro),
	constraint check_danhgia check(DanhGia between 1 and 5)
)

insert into loainha
values
(1, N'Căn hộ chung cư'),
(2, N'Nhà nguyên căn'),
(3, N'Phòng trọ khép kín'),
(4, N'Nhà trọ chung chủ'),
(5, N'Nhà trọ homestay');

insert into nguoidung
values
('PS28998', N'Nguyễn Thành Tài', 1, '0361559872', N'141 Phạm Văn Đồng, Phường Bến Nghé', N'Quận 1', 'taintps28998@fpt.edu.vn'),
('PS29018', N'Nguyễn Hồ Phát', 1, '0361784873', N'23 Cao Bá Quát, Phường Bến Thành', N'Quận 1', 'phatnhps29018@fpt.edu.vn'),
('PS29060', N'Nguyễn Tấn Lộc', 1, '0361449874', N'166 Bùi Thị Xuân, Phường Phạm Ngũ Lão', N'Quận 1', 'locntps29060@fpt.edu.vn'),
('PS29063', N'Hồ Thanh Tài', 1, '0368949875', N'56 Tô Ký, Phường Trung Mỹ Tây', N'Quận 12', 'taihtps29063@fpt.edu.vn'),
('PS29071', N'Nguyễn Vũ Hùng', 1, '0369999876', N'133 Hai Bà Trưng, Phường Tân Tạo', N'Quận Gò Vấp', 'hungnvps29071@fpt.edu.vn'),
('PS29072', N'Phùng Châu Phát', 1, '0336959877', N'111 Hàm Nghi, Phường Tân Tạo A', N'Quận Gò Vấp', 'phatpcps29072@fpt.edu.vn'),
('PS29073', N'Dương Hoàng Anh Cường', 1, '0933359878', N'141 Cao Bá Quát, Phường Bến Thành', N'Quận 1', 'cuongdhaps29073@fpt.edu.vn'),
('PS29089', N'Vũ Anh Khoa', 1, '0696559879', N'166 Lê Lai, Phường Bến Nghé', N'Quận 1', 'khoavaps29089@fpt.edu.vn'),
('PS29106', N'Cao Minh Hiển', 1, '0361784880', N'256 Lê Lợi, Phường Bến Thành', N'Quận 1', 'hiencmps29106@fpt.edu.vn'),
('PS29113', N'Hoàng Công Hiếu', 1, '0345879881', N'77 Bùi Thị Xuân, Phường Tân Tạo', N'Quận Gò Vấp', 'hieuhcps29113@fpt.edu.vn'),
('PS29117', N'Phạm Nhật Hào', 1, '0399559882', N'146 Hai Bà Trưng, Phường Trung Mỹ Tây', N'Quận 12', 'haopnps29117@fpt.edu.vn'),
('PS29215', N'Cao Trọng Lễ', 1, '0364859883', N'141 Tô Ký, Phường Trung Mỹ Tây', N'Quận 12', 'lectps29215@fpt.edu.vn');

insert into NHATRO
values
('NT001', 1, 'PS28998', 25, 7000000, N'141 Phạm Văn Đồng, Phường Bến Nghé', N'Quận 1',
N'Phòng hiện đại với nội thất chất lượng cao và không gian chào đón, đảm bảo một kỳ nghỉ thoải mái.', '2023-02-24'),
('NT002', 1, 'PS29089', 50, 12000000, N'23 Cao Bá Quát, Phường Bến Thành', N'Quận 1'
, N'Phòng giá cả phải chăng với các tiện ích cần thiết, cung cấp một lựa chọn chỗ ở tiện lợi và tiết kiệm ngân sách.', '2022-12-24'),
('NT003', 1, 'PS29113', 45, 10500000, N'166 Bùi Thị Xuân, Phường Phạm Ngũ Lão', N'Quận 1'
, N'Phòng giá cả phải chăng với các tiện ích cần thiết, cung cấp một lựa chọn chỗ ở tiện lợi và tiết kiệm ngân sách.', '2023-01-04'),
('NT004', 2, 'PS28998', 49, 14000000, N'56 Tô Ký, Phường Trung Mỹ Tây', N'Quận 12',
N'Ngôi nhà rộng rãi với nhiều phòng ngủ và sân sau lớn, phù hợp cho gia đình hoặc nhóm.', '2023-04-04'),
('NT005', 2, 'PS29071', 64, 19000000, N'133 Hai Bà Trưng, Phường Tân Tạo', N'Quận Gò Vấp',
N'Ngôi nhà thanh lịch với không gian sống rộng rãi, lý tưởng cho việc tổ chức các buổi gặp gỡ và tạo dựng những kỷ niệm đáng nhớ', '2023-02-02'),
('NT006', 3, 'PS29073', 14, 4000000, N'111 Hàm Nghi, Phường Tân Tạo A', N'Quận Gò Vấp', 
N'Phòng được trang bị đầy đủ nội thất, với các tiện nghi hiện đại và không gian yên tĩnh, lý tưởng cho cá nhân hoặc cặp đôi
', '2023-02-04'),
('NT007', 3, 'PS29073', 18, 5000000, N'141 Cao Bá Quát, Phường Bến Thành', N'Quận 1', 
N'Phòng nằm ở vị trí thuận tiện, được trang trí đẹp mắt và có không gian sống thoải mái.', '2022-07-24'),
('NT008', 4, 'PS29063', 54, 4000000, N'166 Lê Lai, Phường Bến Nghé', N'Quận 1', 
N'Ngôi nhà tuyệt đẹp với tầm nhìn toàn cảnh, đi kèm với tiện nghi sang trọng và thiết kế tinh tế.', '2022-08-30'),
('NT009', 4, 'PS29117', 60, 5000000, N'256 Lê Lợi, Phường Bến Thành', N'Quận 1',
N'Ngôi nhà rộng rãi với tiện nghi hiện đại, mang đến một môi trường sống thoải mái và phong cách.', '2023-03-13'),
('NT010', 4, 'PS29089', 70, 6400000, N'77 Bùi Thị Xuân, Phường Tân Tạo', N'Quận Gò Vấp', 
N'Ngôi nhà đẹp với kiến trúc hiện đại, thiết kế nội thất tinh tế và trải nghiệm sống sang trọng.', '2023-05-05'),
('NT011', 4, 'PS29117', 64, 5500000, N'146 Hai Bà Trưng, Phường Trung Mỹ Tây', N'Quận 12', 
N'Ngôi nhà quyến rũ với khu vườn được chăm sóc cẩn thận, tạo nên một không gian yên bình và đẹp như tranh.', '2023-04-07'),
('NT012', 5, 'PS29089', 25, 5000000, N'23 Cao Bá Quát, Phường Bến Thành', N'Quận 12', 
N'Phòng ấm cúng với tiện lợi trong việc di chuyển và gần các tiện ích, hoàn hảo cho cá nhân luôn bận rộn.', '2023-05-19');
go

insert into DANHGIA
values
('PS29018', 'NT001', 1, N'Phòng nhỏ và chật chội. Giường không thoải mái và không có thông gió đúng cách.'),
('PS29018', 'NT006', 2, N'Phòng có tiện nghi tốt, nhưng sạch sẽ có thể cải thiện. Tiếng ồn từ các phòng lân cận khá phiền toái.'),
('PS29060', 'NT006', 2, N'Vị trí phòng thuận tiện, nhưng nội thất cũ kỹ và cần được thay mới. Kết nối Wi-Fi không đáng tin cậy.'),
('PS29071', 'NT004', 3
, N'Phòng đủ rộng và có giường thoải mái. Tuy nhiên, phòng tắm có thể được vệ sinh sạch sẽ hơn và máy lạnh không hiệu quả.'),
('PS29071', 'NT005', 3
, N'Phòng có tầm nhìn tốt và đủ không gian lưu trữ. Gian bếp nhỏ hữu ích, nhưng tiếng ồn từ đường phố có thể nghe vào bên trong.'),
('PS29072', 'NT006', 4
, N'Phòng được trang bị đầy đủ và có thiết kế hiện đại. Các tiện nghi cung cấp đáp ứng được yêu cầu, và nhân viên thân thiện và nhiệt tình.'),
('PS29073', 'NT007', 4
, N'Phòng sạch sẽ và được bảo quản tốt. Giường thoải mái, phòng tắm có áp lực nước tốt. Tín hiệu Wi-Fi mạnh'),
('PS29089', 'NT001', 4
, N'Phòng có không gian ấm cúng và khu vực ngồi thoải mái. Vị trí thuận tiện, dễ dàng di chuyển bằng phương tiện công cộng.'),
('PS29106', 'NT001', 4
, N'Phòng có đủ ánh sáng tự nhiên và không gian ấm cúng. Vệ sinh tốt, và các tiện nghi đáp ứng được mong đợi của tôi'),
('PS29106', 'NT010', 5
, N'Phòng vượt quá mong đợi của tôi. Rộng rãi, trang trí đẹp và mang đến cảm giác sang trọng. Các tiện nghi cung cấp tốt nhất.'),
('PS29117', 'NT004', 5
, N'Phòng sạch sẽ và được trang bị đẹp mắt. Giường cực kỳ thoải mái, cách cách âm tốt. Tôi có một đêm ngủ tuyệt vời.'),
('PS29215', 'NT012', 5
, N'Phòng có đầy đủ tiện nghi và hơn thế nữa. Rộng rãi, sạch sẽ và được trang bị đầy đủ. Nhân viên đã làm việc vượt xa mong đợi để đảm bảo kỳ nghỉ thú vị.');
