import Footer from "@/src/component/Footer";
import Header from "@/src/component/Header";
import "@/styles/globals.css";

export default function App({ Component, pageProps }) {
  return (
    <div>
      <Header></Header>
      <Component {...pageProps} />
      <Footer></Footer>
    </div>
  );
}
