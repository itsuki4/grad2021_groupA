<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>


<meta charset="UTF-8">
<title>空き情報住所検索</title>
<link rel="stylesheet" href="/grad2021_groupA/shelter_css/css/style.css">
<%@ include file="baseNavber.jsp" %>

</head>
<body>

<div id="contents">
<div class="inner">
<div id="main">
<h2>都道府県を選択してください。</h2>
<form action="/grad2021_groupA/Shelter_checkboxServlet" method="get">
<article><table class="ta1">
<tr>
<th><h3>北海道 東北</h3></th>
<td><input type="checkbox" name="prefecture" value="北海道"><label for="Hokkaidô">北海道</label>
<input type="checkbox" name="prefecture" value="青森"><label for="Aomori">青森県</label>
<input type="checkbox" name="prefecture" value="岩手"><label for="Iwate">岩手県</label>
<input type="checkbox" name="prefecture" value="宮城"><label for="Miyagi">宮城県</label>
<input type="checkbox" name="prefecture" value="秋田"><label for="Akita">秋田県</label>
<input type="checkbox" name="prefecture" value="山形"><label for="Yamagata">山形県</label>
<input type="checkbox" name="prefecture" value="福島"><label for="Hukusima">福島県</label>
</td></tr>
<tr><th>
<h3>関東</h3></th>
<td><input type="checkbox" name="prefecture" class="ibaraki" value="茨城"><label for="Ibaraki">茨城県</label>
<input type="checkbox" name="prefecture" class="totigi" value="栃木"><label for="Totigi">栃木県</label>
<input type="checkbox" name="prefecture" class="gunma" value="群馬"><label for="Gunma">群馬県</label>
<input type="checkbox" name="prefecture" class="saitama" value="埼玉"><label for="Saitama">埼玉県</label>
<input type="checkbox" name="prefecture" class="tiba" value="千葉"><label for="Tiba">千葉県</label>
<input type="checkbox" name="prefecture" class="tokyo" value="東京都"><label for="Tôkyô">東京都</label>
<input type="checkbox" name="prefecture" class="kanagawa" value="神奈川"><label for="Kanagawa">神奈川県</label>
</td></tr>
<tr><th>
<h3>中部</h3></th>
<td><input type="checkbox" name="prefecture" class="niigata" value="新潟"><label for="Niigata">新潟県</label>
<input type="checkbox" name="prefecture" class="toyama" value="富山"><label for="Toyama">富山県</label>
<input type="checkbox" name="prefecture" class="isikawa" value="石川"><label for="Isikawa">石川県</label>
<input type="checkbox" name="prefecture" class="fukui" value="福井"><label for="Hukui">福井県</label>
<input type="checkbox" name="prefecture" class="yamanasi" value="山梨"><label for="Yamanasi">山梨県</label>
<input type="checkbox" name="prefecture" class="nagano" value="長野"><label for="Nagano">長野県</label>
<input type="checkbox" name="prefecture" class="gihu" value="岐阜"><label for="Gihu">岐阜県</label>
<input type="checkbox" name="prefecture" class="sizuoka" value="静岡"><label for="Sizuoka">静岡県</label>
<input type="checkbox" name="prefecture" class="aiti" value="愛知"><label for="Aiti">愛知県</label>
</td></tr>
<tr><th>
<h3>関西</h3></th>
<td><input type="checkbox" name="prefecture" id="mie" value="三重"><label for="Mie">三重県</label>
<input type="checkbox" name="prefecture" id="kyôto" value="京都府"><label for="Kyôto">京都府</label>
<input type="checkbox" name="prefecture" id="osaka" value="大阪府"><label for="Ôsaka">大阪府</label>
<input type="checkbox" name="prefecture" id="hyogo" value="兵庫"><label for="Hyôgo">兵庫県</label>
<input type="checkbox" name="prefecture" id="nara" value="奈良"><label for="Nara">奈良県</label>
<input type="checkbox" name="prefecture" id="wakayama" value="和歌山"><label for="Wakayama">和歌山県</label>
</td></tr>
<tr><th>
<h3>中国</h3></th>
<td><input type="checkbox" name="prefecture" id="tottori" value="鳥取"><label for="Tottori">鳥取県</label>
<input type="checkbox" name="prefecture" id="simane" value="島根"><label for="Simane">島根県</label>
<input type="checkbox" name="prefecture" id="okayama" value="岡山"><label for="Okayama">岡山県</label>
<input type="checkbox" name="prefecture" id="hirosima" value="広島"><label for="Hirosima">広島県</label>
<input type="checkbox" name="prefecture" id="yamaguti" value="山口"><label for="Yamaguti">山口県</label>
</td></tr>
<tr><th>
<h3>四国</h3></th>
<td><input type="checkbox" name="prefecture" id="tokusima" value="徳島"><label for="Tokusima">徳島県</label>
<input type="checkbox" name="prefecture" id="kagawa" value="香川"><label for="Kagawa">香川県</label>
<input type="checkbox" name="prefecture" id="ehime" value="愛媛"><label for="Ehime">愛媛県</label>
<input type="checkbox" name="prefecture" id="koti" value="高知"><label for="Kôti">高知県</label>
</td></tr>
<tr><th>
<h3>九州</h3></th>
<td><input type="checkbox" name="prefecture" id="fukuoka" value="福岡"><label for="Hukuoka">福岡県</label>
<input type="checkbox" name="prefecture" id="saga" value="佐賀"><label for="Saga">佐賀県</label>
<input type="checkbox" name="prefecture" id="nagasaki" value="長崎"><label for="Nagasaki">長崎県</label>
<input type="checkbox" name="prefecture" id="kumamoto" value="熊本"><label for="Kumamoto">熊本県</label>
<input type="checkbox" name="prefecture" id="oita" value="大分"><label for="Ôita">大分県</label>
<input type="checkbox" name="prefecture" id="miyazaki" value="宮崎"><label for="Miyazaki">宮崎県</label>
<input type="checkbox" name="prefecture" id="kagosima" value="鹿児島"><label for="Kagosima">鹿児島県</label>
<input type="checkbox" name="prefecture" id="okinawa" value="沖縄"><label for="Okinawa">沖縄県</label>
</td></tr>
</table>
<br><input type="submit" value="送信する">
</article>
</form>
</div>
</div>
</div>
<!--
<section id="top-contents">
<ul id="map">
<li class="hokkaido"><input type="checkbox" name="prefecture" id="Hokkaidô" value="北海道"><label for="Hokkaidô">北海道</label></li>

<li class="tohoku"><input type="checkbox" name="prefecture" class="aomori" value="青森"><label for="Aomori">青森県</label></li>
<li class="tohoku"><input type="checkbox" name="prefecture" class="iwate" value="岩手"><label for="Iwate">岩手県</label></li>
<li class="tohoku"><input type="checkbox" name="prefecture" class="miyagi" value="宮城"><label for="Miyagi">宮城県</label></li>
<li class="tohoku"><input type="checkbox" name="prefecture" class="akita" value="秋田"><label for="Akita">秋田県</label></li>
<li class="tohoku"><input type="checkbox" name="prefecture" class="yamagata" value="山形"><label for="Yamagata">山形県</label></li>
<li class="tohoku"><input type="checkbox" name="prefecture" class="fukushima" value="福島"><label for="Hukusima">福島県</label></li>

<li class="kanto"><input type="checkbox" name="prefecture" class="ibaraki" value="茨城"><label for="Ibaraki">茨城県</label></li>
<li class="kanto"><input type="checkbox" name="prefecture" class="totigi" value="栃木"><label for="Totigi">栃木県</label></li>
<li class="kanto"><input type="checkbox" name="prefecture" class="gunma" value="群馬"><label for="Gunma">群馬県</label></li>
<li class="kanto"><input type="checkbox" name="prefecture" class="saitama" value="埼玉"><label for="Saitama">埼玉県</label></li>
<li class="kanto"><input type="checkbox" name="prefecture" class="tiba" value="千葉"><label for="Tiba">千葉県</label></li>
<li class="kanto"><input type="checkbox" name="prefecture" class="tokyo" value="東京都"><label for="Tôkyô">東京都</label></li>
<li class="kanto"><input type="checkbox" name="prefecture" class="kanagawa" value="神奈川"><label for="Kanagawa">神奈川県</label></li>

<li class="tyubu"><input type="checkbox" name="prefecture" class="niigata" value="新潟"><label for="Niigata">新潟県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="toyama" value="富山"><label for="Toyama">富山県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="isikawa" value="石川"><label for="Isikawa">石川県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="fukui" value="福井"><label for="Hukui">福井県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="yamanasi" value="山梨"><label for="Yamanasi">山梨県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="nagano" value="長野"><label for="Nagano">長野県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="gihu" value="岐阜"><label for="Gihu">岐阜県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="sizuoka" value="静岡"><label for="Sizuoka">静岡県</label></li>
<li class="tyubu"><input type="checkbox" name="prefecture" class="aiti" value="愛知"><label for="Aiti">愛知県</label></li>

<li class="kansai"><input type="checkbox" name="prefecture" id="mie" value="三重"><label for="Mie">三重県</label></li>
<li class="kansai"><input type="checkbox" name="prefecture" id="siga" value="滋賀"><label for="Siga">滋賀県</label></li>
<li class="kansai"><input type="checkbox" name="prefecture" id="kyôto" value="京都府"><label for="Kyôto">京都府</label></li>
<li class="kansai"><input type="checkbox" name="prefecture" id="osaka" value="大阪府"><label for="Ôsaka">大阪府</label></li>
<li class="kansai"><input type="checkbox" name="prefecture" id="hyogo" value="兵庫"><label for="Hyôgo">兵庫県</label></li>
<li class="kansai"><input type="checkbox" name="prefecture" id="nara" value="奈良"><label for="Nara">奈良県</label></li>
<li class="kansai"><input type="checkbox" name="prefecture" id="wakayama" value="和歌山"><label for="Wakayama">和歌山県</label></li>

<li class="cyugoku"><input type="checkbox" name="prefecture" id="tottori" value="鳥取"><label for="Tottori">鳥取県</label></li>
<li class="cyugoku"><input type="checkbox" name="prefecture" id="simane" value="島根"><label for="Simane">島根県</label></li>
<li class="cyugoku"><input type="checkbox" name="prefecture" id="okayama" value="岡山"><label for="Okayama">岡山県</label></li>
<li class="cyugoku"><input type="checkbox" name="prefecture" id="hirosima" value="広島"><label for="Hirosima">広島県</label></li>
<li class="cyugoku"><input type="checkbox" name="prefecture" id="yamaguti" value="山口"><label for="Yamaguti">山口県</label></li>

<li class="shikoku"><input type="checkbox" name="prefecture" id="tokusima" value="徳島"><label for="Tokusima">徳島県</label></li>
<li class="shikoku"><input type="checkbox" name="prefecture" id="kagawa" value="香川"><label for="Kagawa">香川県</label></li>
<li class="shikoku"><input type="checkbox" name="prefecture" id="ehime" value="愛媛"><label for="Ehime">愛媛県</label></li>
<li class="shikoku"><input type="checkbox" name="prefecture" id="koti" value="高知"><label for="Kôti">高知県</label></li>

<li class="kyusyu"><input type="checkbox" name="prefecture" id="fukuoka" value="福岡"><label for="Hukuoka">福岡県</label></li>
<li class="kyusyu"><input type="checkbox" name="prefecture" id="saga" value="佐賀"><label for="Saga">佐賀県</label></li>
<li class="kyusyu"><input type="checkbox" name="prefecture" id="nagasaki" value="長崎"><label for="Nagasaki">長崎県</label></li>
<li class="kyusyu"><input type="checkbox" name="prefecture" id="kumamoto" value="熊本"><label for="Kumamoto">熊本県</label></li>
<li class="kyusyu"><input type="checkbox" name="prefecture" id="oita" value="大分"><label for="Ôita">大分県</label></li>
<li class="kyusyu"><input type="checkbox" name="prefecture" id="miyazaki" value="宮崎"><label for="Miyazaki">宮崎県</label></li>
<li class="kyusyu"><input type="checkbox" name="prefecture" id="kagosima" value="鹿児島"><label for="Kagosima">鹿児島県</label></li>
<li class="kyusyu"><input type="checkbox" name="prefecture" id="okinawa" value="沖縄"><label for="Okinawa">沖縄県</label></li>



 -->

<%@ include file="basefooter.jsp" %>
</body>
</html>