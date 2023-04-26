import Head from "next/head";
import Image from "next/image";

import styles from "@/styles/Home.module.css";

export default function Home() {
  return (
    <>
      <Head>
        <title>힐링 스토리 Healing Story</title>
        <meta
          name="description"
          content="현대인을 위한 마음 치유, 힐링 스토리 Healing Story"
        />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
      </Head>
      <p>Home</p>
    </>
  );
}
